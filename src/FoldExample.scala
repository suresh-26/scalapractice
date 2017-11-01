
object FoldExample {

  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5, 6, 7)
    //println("total number: " + getTotal(numbers))
    //println("total number: " + foldLeftUsing_(numbers))
    println("total number: " + isNoExistsUsingfoldLeft(numbers, 5))
  }

  def getTotal(numbers: List[Int]): Int = {
    numbers.foldRight(0) { (a, b) => a + b }
  }

  def foldLeftUsing_(numbers: List[Int]) = {
    numbers.foldLeft(0)(_ + _)
  }

  def isNoExistsUsingfoldLeft(numbers: List[Int], x: Int) = {
    numbers.foldLeft(false) { (a, b) => { println(a +" ,b: "+b)
      a|| (x == b)} }
  }
}