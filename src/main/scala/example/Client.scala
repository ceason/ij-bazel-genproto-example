package example

import helloworld.HelloRequest

object Client {

  def main(args: Array[String]): Unit = {

    val asdf1 = new HelloRequest()
    val asdf2 = HelloRequest()

    asdf1.name
    asdf2.name

  }

}
