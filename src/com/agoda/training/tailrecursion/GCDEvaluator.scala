package com.agoda.training.tailrecursion
import scala.annotation.tailrec

//A good read on tail recursion 
//https://github.com/iirvine/functional-programming-in-scala/blob/master/notes/week%201/006-tail-recursion.md
class GCDEvaluator {

  def gcdWithOutRec(num1: Int, num2: Int): Int = {
    var tempNum2 = num2
    var temNum1 = num1
    while (tempNum2 > 0) {
      val temp = num2;
      tempNum2 = num1 % num2;
      temNum1 = temp;
    }
    temNum1
  }

  @tailrec
  final def gcdWithTailRec(num1: Int, num2: Int) {
    if (num2 == 0) num1
    else gcdWithTailRec(num2, num1 % num2)
  }

  @tailrec
  final def gcdWithPatternNHeadRec(num1: Int, num2: Int) {
    num2 match {
      case 0 => num1
      case _ => gcdWithPatternNHeadRec(num2, num1 % num2)
    }
  }
}