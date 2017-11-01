package com.agoda.training.tailrecursion

object GcdTest {
  def main(args: Array[String]): Unit = {
    val gcd = new GCDEvaluator()
    println(gcd.gcdWithOutRec(60, 30))
    println(gcd.gcdWithPatternNHeadRec(60, 45))
    //gcdWithHeadRec
  }
}