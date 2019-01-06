load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")

java_library(
    name = "protobuf_java",
    exports = [
        "@com_google_protobuf//:protobuf_java",
    ],
    visibility = [
        "//visibility:public",
    ],
)

java_library(
    name = "protobuf_java_util",
    exports = [
        "@com_google_protobuf//:protobuf_java_util",
    ],
    visibility = [
        "//visibility:public",
    ],
)
