
object IfElseWithMap {
  def main(args: Array[String]): Unit = {
    println("abc".toList)
    val list = List(1, 2, 3) map intToString
    list.foreach(println)
  }

  def intToString(num: Int) = {
    if (num == 1) "one"
    else if (num == 2) "two"
    else "three"
  }
}