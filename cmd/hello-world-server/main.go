package main

import (
	"context"
	"github.com/ceason/ij-bazel-genproto-example/proto/helloworld"
	"google.golang.org/grpc"
)

func main() {

	ctx := context.Background()


	req := helloworld.HelloRequest{
		Name: "chris",
	}

	req.Name = "asdfwtfbbqsadfas"

	var cc *grpc.ClientConn
	client := helloworld.NewGreeterClient(cc)
	res, err := client.SayHello(ctx, &req)
	if err != nil {
		panic(err)
	}
	print(res.Message)

}
