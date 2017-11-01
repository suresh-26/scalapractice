package recurssionPractice
import scala.annotation.tailrec
object AvinashProblem {

  def main(args: Array[String]): Unit = {
    println(getSeqWithRec(6))
    println(getSeqWithTailRec(6))
  }

  def getSeqWithRec(num: Int): Int = {
    num match {
      case 1 => num
      case num if num % 2 == 0 => num + getSeqWithRec(num / 2)
      case _ => num + getSeqWithRec(num * 3 + 1)
    }
  }

  def getSeqWithTailRec(num: Int): Int = {
    @tailrec
    def getSeqAccumulation(acc: Int, num: Int): Int = {
      num match {
        case 1 => acc
        case num if num % 2 == 0 => getSeqAccumulation((acc + num / 2), num / 2)
        case _ => getSeqAccumulation((acc + (num * 3 + 1)), num * 3 + 1)
      }
    }
    getSeqAccumulation(0, num)
  }
}

//3 + 10 + 5 + 16 + 8 + 4 + 2 + 1