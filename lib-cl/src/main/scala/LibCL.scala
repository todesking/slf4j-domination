object LibCL {
  def hello(): Unit = {
    val logger = org.apache.commons.logging.LogFactory.getLog(getClass())
    logger.info("Hello from Commons Logging")
  }
}
