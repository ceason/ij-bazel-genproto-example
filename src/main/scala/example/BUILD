load("@io_bazel_rules_scala//scala_proto:scala_proto.bzl", "scalapb_proto_library")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_binary")

scalapb_proto_library(
    name = "helloworld_scalapb_proto",
    with_flat_package = True,
    with_grpc = True,
    deps = [
        "//proto/helloworld:helloworld_proto",
    ],
)

#scala_binary(
#    name = "client",
#    srcs = ["Client.scala"],
#    main_class = "example.Client",
#    deps = [
#        ":helloworld_scalapb_proto",
#    ],
#)

java_proto_library(
    name = "helloworld_java_proto",
    deps = [
        "//proto/helloworld:helloworld_proto",
    ],
)

scala_binary(
    name = "javapbclient",
    srcs = ["JavapbClient.scala"],
    main_class = "example.JavapbClient",
    deps = [
        ":helloworld_java_proto",
        "@com_google_protobuf//:protobuf_java",
    ],
)
