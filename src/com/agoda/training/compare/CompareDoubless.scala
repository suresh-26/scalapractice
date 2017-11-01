package com.agoda.training.compare

class Compare(val val1: Double, val constant: Double = 0.5) {
  def ~=(that: Compare): Boolean = {
    that match {
      case _ if that.val1 > this.val1 => that.val1 - this.val1 <= constant
      case _ if this.val1 > that.val1 => this.val1 - that.val1 <= constant
      case _ => false
    }
  }
}

object CompareDoublessTest {
  def main(args: Array[String]): Unit = {
    val d1 = new Compare(22.5)
    val d2 = new Compare(21.8)
    println(d1 ~= d2)
  }
}