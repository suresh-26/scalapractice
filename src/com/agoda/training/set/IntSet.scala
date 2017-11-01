package com.agoda.training.set

trait IntSet {
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
}