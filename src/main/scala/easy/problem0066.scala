package com.scala.leetcode.problem0066

object Solution {
  def plusOne(digits: Array[Int]): Array[Int] = {
    plusOneRecursive(digits.reverse, Array[Int](), 1)
  }

  private def plusOneRecursive(inpt: Array[Int], otpt: Array[Int], carry: Int): Array[Int] = (inpt, carry) match {
    case (Array[Int](), 0) => otpt 
    case (Array[Int](), 1) => 1 +: otpt 
    case _ => plusOneRecursive(inpt.tail, (inpt.head+carry)%10 +: otpt, (inpt.head + carry)/10)
  }
}

