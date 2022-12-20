object LibSlf4j {
  def hello(): Unit = {
    val logger = org.slf4j.LoggerFactory.getLogger(getClass())
    logger.info("Hello from slf4j")
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    // Setup java.util.logging for slf4j
    org.slf4j.bridge.SLF4JBridgeHandler.removeHandlersForRootLogger()
    org.slf4j.bridge.SLF4JBridgeHandler.install()

    LibCL.hello()
    LibLog4j1.hello()
    LibLog4j2.hello()
    LibJUL.hello()
    LibSlf4j.hello()
  }
}
