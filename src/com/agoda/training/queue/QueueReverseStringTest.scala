package com.agoda.training.queue

object QueueReverseStringTest {
  def main(args: Array[String]): Unit = {
    val queue = new QueueImpl with ChangeableElement
    queue.put("one")
    queue.put("two")
    queue.put("three")
    queue.put("four")
    println(queue.get())
    println(queue.get())
    println(queue.get())
    println(queue.get())
  }
}