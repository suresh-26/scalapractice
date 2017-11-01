package com.agoda.training.queue
import scala.collection.mutable.ArrayBuffer
object QueueTest {

  def main(args: Array[String]): Unit = {
    val queue = new QueueImpl();
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