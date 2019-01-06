package example.client

import io.grpc.ManagedChannelBuilder
import proto.helloworld.{GreeterGrpc, HelloRequest}

/**
  *
  */
object Client {

  def main(args: Array[String]): Unit = {

    val host = "localhost"
    val port = 5555

    val channel = ManagedChannelBuilder
        .forAddress(host, port)
        .usePlaintext(true)
        .build

    val blockingStub = GreeterGrpc.newBlockingStub(channel)

    val asdf = HelloRequest.newBuilder()
        .setName("chris")
        .build()

  }

}
