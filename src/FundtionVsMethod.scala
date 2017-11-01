
object FundtionVsMethod extends App {
  val even = (x: Int) => {
    println("even")
    x % 2 == 0
  }

  val even1: Int => Boolean = {
    println("even1 func")
    _ % 2 == 0
  }

  println(even(1))
  println(even(1))

  println(even1(2))
  println(even1(2))

}