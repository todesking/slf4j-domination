object LibJUL {
  def hello(): Unit = {
    val logger = java.util.logging.Logger.getLogger(getClass().toString)
    logger.info("Hello from java.util.logging")
  }
}
