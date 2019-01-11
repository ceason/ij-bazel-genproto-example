load("@bazel_tools//tools/build_defs/repo:git.bzl", "git_repository")

#git_repository(
#    name = "rules_terraform",
#    commit = "48cfbfabb8c7aa887db649ce82ad47716f3d682f",
#    remote = "https://github.com/ceason/rules_terraform.git",
#)
#
git_repository(
    name = "io_bazel_rules_go",
    commit = "b463dbfef16e07d235800267f1709acf65808396",
    remote = "https://github.com/bazelbuild/rules_go.git",
)

git_repository(
    name = "com_google_protobuf",
    remote = "https://github.com/protocolbuffers/protobuf.git",
    tag = "v3.6.1.3",
)

git_repository(
    name = "io_grpc_grpc_java",
    #tag = "v1.17.2",
    commit = "485895282216a64e56c56837279921e32f5dc824",
    remote = "https://github.com/ceason/grpc-java.git",
)

#git_repository(
#    name = "io_bazel_rules_docker",
#    commit = "1d64e07913281467a7866cc0c91ff9fd241937cc",
#    remote = "https://github.com/bazelbuild/rules_docker.git",
#)

git_repository(
    name = "bazel_gazelle",
    commit = "422ea009aca276245ac5152e5d598d1e2c3e2813",
    remote = "https://github.com/bazelbuild/bazel-gazelle.git",
)

git_repository(
    name = "com_github_johnynek_bazel_deps",
    commit = "a07cf5106fe84ccfc39997b13a877f89c1ebe0f5",
    remote = "https://github.com/ceason/bazel-deps.git",
)

git_repository(
    name = "io_bazel_rules_scala",
    commit = "326b4ce252c36aeff2232e241ff4bfd8d6f6e071",
    remote = "https://github.com/bazelbuild/rules_scala.git",
)

load("@io_grpc_grpc_java//:repositories.bzl", "grpc_java_register_toolchains", "grpc_java_repositories")

grpc_java_repositories()

grpc_java_register_toolchains()

load("//3rdparty:jvm.bzl", "maven_dependencies")

maven_dependencies()

load("@io_bazel_rules_go//go:def.bzl", "go_register_toolchains", "go_rules_dependencies")

go_rules_dependencies()

go_register_toolchains()

load("@io_bazel_rules_scala//scala:scala.bzl", "scala_repositories")

scala_repositories()

load("@io_bazel_rules_scala//scala:toolchains.bzl", "scala_register_toolchains")

scala_register_toolchains()

#load("@io_bazel_rules_docker//go:image.bzl", _go_image_repos = "repositories")
#_go_image_repos()

load("@com_github_johnynek_bazel_deps//:def.bzl", "bazeldeps_dependencies")

bazeldeps_dependencies()

load("@bazel_gazelle//:deps.bzl", "gazelle_dependencies", "go_repository")

gazelle_dependencies()

go_repository(
    name = "com_github_golang_dep",
    importpath = "github.com/golang/dep",
    tag = "v0.5.0",
)

#load("@rules_terraform//terraform:dependencies.bzl", "terraform_repositories")
#terraform_repositories()
