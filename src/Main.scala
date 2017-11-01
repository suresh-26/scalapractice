
object Main {
  def main(args: Array[String]): Unit = {
    val up = new Upper
    up.upper("Hello", "World!")
      .foreach(println)
  }
}
