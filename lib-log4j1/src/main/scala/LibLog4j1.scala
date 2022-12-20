object LibLog4j1 {
  def hello(): Unit = {
    val logger = org.apache.log4j.Logger.getLogger(getClass())
    logger.info("Hello from log4j1")
  }
}
