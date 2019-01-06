load("@io_grpc_grpc_java//:java_grpc_library.bzl", "java_grpc_library")

java_proto_library(
    name = "helloworld_java_proto",
    visibility = ["//src:__subpackages__"],
    deps = [
        "//proto/helloworld:helloworld_proto",
    ],
)

java_grpc_library(
    name = "helloworld_java_grpc",
    srcs = [
        "//proto/helloworld:helloworld_proto",
    ],
    visibility = ["//src:__subpackages__"],
    deps = [":helloworld_java_proto"],
)
