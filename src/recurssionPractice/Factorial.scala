package recurssionPractice
import scala.annotation.tailrec
class Factorial {
  final def factorialWithoutRec(num: Int): Int = {
    var fact = 1
    for (a <- 1 to num) {
      fact *= a
    }
    fact
  }

  final def factorialWithRec(num: Int): Int = {
    if (num == 1) num
    num * factorialWithoutRec(num - 1)
  }

  final def factorialWithPatternNRec(num: Int): Int = {
    num match {
      case 1 => num
      case _ => num * factorialWithoutRec(num - 1)
    }
  }

  final def factorialWithPatternNTailRec(num: Int): Int = {
    @tailrec
    def factorialAccumulation(acc: Int, num: Int): Int = {
      num match {
        case 1 => acc
        case _ => factorialAccumulation((acc * num), num - 1)
      }
    }
    factorialAccumulation(1, num)
  }
}