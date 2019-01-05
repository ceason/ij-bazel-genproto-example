package example

import helloworld.HelloRequest

object JavapbClient {

  def main(args: Array[String]): Unit = {

    val asdf = HelloRequest.newBuilder()
        .setName("chris")
        .build()


    val asdf1 = new HelloRequest()

    asdf1.getName

  }

}
