
object FunctionAsInputParam {
  val func = (i: Int) => i match {
    case i if (i < 10) => "lessthan10"
    case _ => "greater than10"
  }

  val func2 = { "executed func2" }
  def main(args: Array[String]): Unit = {

    println(met(func))

    println(met2(func2))

    println(met3(func2))
  }

  def met(f: Int => String) = {
    println(f(5))
    "function executed"
  }

  def met2(f: => String) = {
    println(f)
    "function executed"
  }

  def met3[A, B](f: A => B) = {
    println(f)
    "function executed"
  }
}