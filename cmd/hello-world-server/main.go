package main

import (
	"github.com/ceason/ij-bazel-genproto-example/proto/helloworld"
	"google.golang.org/grpc"
)

func main() {
	req := helloworld.HelloRequest{}

	var cc *grpc.ClientConn
	client := helloworld.NewGreeterClient(cc)

}
