package recurssionPractice
import scala.annotation.tailrec
object Sum {
  def main(args: Array[String]): Unit = {
    println(sumWithHeadRec(List(1, 2, 3, 4, 5)))
    println(sumWithPatternNHeadRec(List(1, 2, 3, 4, 5)))
    println(sumWithPatternNTailRec(List(1, 2, 3, 4, 5)))
  }

  def sumWithHeadRec(list: List[Int]): Int = {
    if (list.isEmpty)
      0
    else {
      val head = list.head
      val tail = list.tail
      println("head: " + head + " ,tail: " + tail)
      head + sumWithHeadRec(tail)
    }
  }

  def sumWithPatternNHeadRec(list: List[Int]): Int = {
    list match {
      case List() => 0
      case head :: tail => head + sumWithPatternNHeadRec(tail)
    }
  }

  def sumWithPatternNTailRec(list: List[Int]): Int = {
    @tailrec
    def sumAccumulation(accu: Int, list: List[Int]): Int = {
      list match {
        case List() => accu
        case head :: tail => {
          println("accu: " + accu + " head: " + head + " ,tail: " + tail)
          sumAccumulation(accu + head, tail)
        }
      }
    }
    sumAccumulation(0, list)
  }

}