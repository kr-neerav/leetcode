package com.scala.leetcode.utils

class Stack[T] {
  private var stck = List[T]()

  def pop(): Option[T] = {
    val result = stck.headOption
    stck = if (result == None) stck else stck.tail 
    result
  }

  def push(value: T): Unit  = stck = value::stck 

  def topValue(): Option[T] = stck.headOption

  def length(): Int = stck.length
}
