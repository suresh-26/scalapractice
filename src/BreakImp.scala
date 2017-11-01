
class BreakImp {
  def break = throw new RuntimeException("break exception")

  def handleBreak(method: => Unit) = {
    try {
      method
    } catch {
      case (exception: Throwable) => {
        println("printing mssg " + exception.getMessage)
      }
    }
  }

  def breakable() = {
    val s = "someName"
    if (s == "someName") {
      break
    } else {
      "done"
    }
  }
}