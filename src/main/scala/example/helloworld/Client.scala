package example.helloworld

import io.grpc.ManagedChannelBuilder
import proto.helloworld.{GreeterGrpc, HelloRequest}

/**
  *
  */
object Client {

  def main(args: Array[String]): Unit = {

    val channel = ManagedChannelBuilder
        .forAddress(Config.host, Config.port)
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
