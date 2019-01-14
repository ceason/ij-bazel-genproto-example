package example.helloworld

/**
  *
  */
object Config {
  lazy val host: String = sys.env.getOrElse("HELLOWORLD_HOST", "localhost")
  lazy val port: Int = sys.env.getOrElse("HELLOWORLD_PORT", "50051").toInt
}
