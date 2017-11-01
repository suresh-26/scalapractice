package com.agoda.training.set

object SetExecutor {
  def main(args: Array[String]): Unit = {
    val set = new NonEmptySet(10, new EmptySet, new EmptySet)
    println(set.incl(11).contains(11))
    set.incl(12)
    set.incl(9)
    set.incl(8)

    println(set.contains(8))
    println(set.contains(10))
  }
}