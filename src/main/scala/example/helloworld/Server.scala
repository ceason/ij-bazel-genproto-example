package example.helloworld

import io.grpc.ServerBuilder
import io.grpc.stub.StreamObserver
import proto.helloworld.{GreeterGrpc, HelloReply, HelloRequest}

/**
  *
  */
object Server {

  val host: String = "localhost"
  val port: Int = 50051

  object GreeterImpl extends GreeterGrpc.GreeterImplBase {
    override def sayHello(request: HelloRequest, responseObserver: StreamObserver[HelloReply]): Unit = {
      println(s"Got a request!")
      val reply = HelloReply.newBuilder()
          .setMessage(s"Hello ${request.getName}")
          .build()
      responseObserver.onNext(reply)
      responseObserver.onCompleted()
    }
  }

  def main(args: Array[String]): Unit = {

    val server = ServerBuilder.forPort(port)
        .addService(GreeterImpl)
        .build()

    sys.addShutdownHook {
      println("*** shutting down gRPC server since JVM is shutting down")
      server.shutdown()
      println("*** server shut down")
    }

    server.start()
    println(s"Server started, listening on $port")
    server.awaitTermination()
  }

}
