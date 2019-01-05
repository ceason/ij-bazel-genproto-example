load("@com_github_johnynek_bazel_deps//:def.bzl", "bazeldeps")

# gazelle:prefix github.com/ceason/ij-bazel-genproto-example

# These are provided by 'rules_go' and can safely be ignored
#  @see https://github.com/bazelbuild/rules_go/blob/master/proto/core.rst#dependencies
# gazelle:exclude vendor/github.com/google/protobuf
# gazelle:exclude vendor/github.com/golang/protobuf
# gazelle:exclude vendor/github.com/mwitkow/go-proto-validators
# gazelle:exclude vendor/github.com/gogo/protobuf
# gazelle:exclude vendor/golang.org/x/text
# gazelle:exclude vendor/golang.org/x/net
# gazelle:exclude vendor/google.golang.org/grpc
# gazelle:exclude vendor/google.golang.org/genproto

genrule(
    name = "dep-ensure",
    outs = ["dep-ensure.sh"],
    cmd = """cat <<'EOF' > $@
#!/usr/bin/env bash
set -euo pipefail
execroot=$$(bazel info execution_root)
cd "$$BUILD_WORKSPACE_DIRECTORY"
$$execroot/$(location @com_github_golang_dep//cmd/dep) ensure
$$execroot/$(location @bazel_gazelle//cmd/gazelle) update
git add Gopkg.{lock,toml} vendor/. $$(find . -name BUILD -o -name BUILD.bazel)
EOF
""",
    executable = True,
    tools = [
        "@bazel_gazelle//cmd/gazelle",
        "@com_github_golang_dep//cmd/dep",
    ],
)

bazeldeps(
    name = "update-maven-deps",
    sha_file = "3rdparty/jvm.bzl",
    deps_file = "dependencies.yaml",
)
