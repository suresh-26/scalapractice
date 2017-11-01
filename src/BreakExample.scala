
object BreakExample {
  def main(args: Array[String]): Unit = {
    val breakImpl = new BreakImp
    breakImpl.handleBreak(breakImpl.breakable)
  }
}