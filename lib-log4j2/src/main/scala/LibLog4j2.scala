object LibLog4j2 {
  def hello(): Unit = {
    val logger = org.apache.logging.log4j.LogManager.getLogger(getClass())
    logger.info("Hello from log4j2")
  }
}
