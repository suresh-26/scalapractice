
object MkStringExample {
  def main(args: Array[String]) = {
    val r = "abc"
    r.addString(new StringBuilder("abc"))
    val combinedString = List("Hello", "World!").
      map(_.toUpperCase).
      mkString("[ ", " - ", " ]")
    println(combinedString)
  }
}