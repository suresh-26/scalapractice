
object HigherOrderFunction {

  def main(args: Array[String]) {
    println(applyFunc(layout, 10))
  }

  /*
   * to add a function as input parameter
   */
  def applyFunc(f: Int => String, v: Int) = f(v)

  /*
   * function which takes input of any type and returns a String
   */
  def layout[A](x: A) = "[" + x.toString() + "]"
}