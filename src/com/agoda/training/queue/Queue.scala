package com.agoda.training.queue

trait Queue {

  def put(element: String): Queue

  def get(): String

}