

object InferReturnExample {
  def main(args: Array[String]): Unit = {
    println(returnByDefault(3))
    val car = new Car(10,20)
    car drive 10
  }
  
 /**
 * Last expression in the function is considered as return statement, even if no explicit return type is defined in method definition 
 * @param number
 * @return
 */
def returnByDefault(number : Int)={
    number*5
    number*2
  }
}