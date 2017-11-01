
object PureFunctionalProgram {
  def main(args: Array[String]): Unit = {
    val returnedFunc = singleExpression(List("10", "20", "30", "40"))
    val list1 = List(20, 30, 30, 40)
    val list2 = List(30, 40, 50, 60)
    // returnedFunc(list1, list2)
  }
  /*
   * this type of method seems to be the one which returns another function
   */
  def singleExpression: List[String] => (List[Int], List[Int]) = {
    a => a map (_.toInt) partition (_ < 30)
  }
}