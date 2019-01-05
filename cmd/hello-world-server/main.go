package main

import (
	"github.com/ceason/ij-bazel-genproto-example/proto/helloworld"
	"google.golang.org/grpc"
)

func main() {
	req := helloworld.HelloRequest{}

	req.Name = "asdfwtfbbqsadfas"

	var cc *grpc.ClientConn
	client := helloworld.NewGreeterClient(cc)
	client.SayHello()

}
