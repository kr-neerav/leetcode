package com.scala.leetcode.problem0070

object Solution {
  def climbStairs(n: Int): Int = {
    fibonacciCalc(1,1,n)
  }

  private def fibonacciCalc(a: Int, b: Int, n: Int): Int = {
    if (n == 1) b
    else fibonacciCalc(b, a+b, n-1)
  }
}

