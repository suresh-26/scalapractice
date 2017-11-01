package recurssionPractice

object FactorialTest {
  def main(args: Array[String]): Unit = {
    val factorial = new Factorial()
    println(factorial.factorialWithoutRec(5))
    println(factorial.factorialWithRec(5))
    println(factorial.factorialWithPatternNRec(5))
    println(factorial.factorialWithPatternNTailRec(5))
  }
}