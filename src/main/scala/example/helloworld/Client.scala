package example.helloworld

import io.grpc.ManagedChannelBuilder
import proto.helloworld.{GreeterGrpc, HelloRequest}

/**
  *
  */
object Client {

  def main(args: Array[String]): Unit = {

    val host = "localhost"
    val port = 50051

    val channel = ManagedChannelBuilder
        .forAddress(host, port)
        .usePlaintext()
        .build

    val blockingStub = GreeterGrpc.newBlockingStub(channel)

    val user = "world"

    val req = HelloRequest.newBuilder()
        .setName(user)
        .build()
    val res = blockingStub.sayHello(req)
    println(s"Greeting: ${res.getMessage}")

  }

}
