package com.scala.leetcode.problem0069

object Solution {
  def mySqrt(x: Int): Int = {
    mySqrtGuessAlgorithm(1,x)
  }

  private def mySqrtGuessAlgorithm(guess: Int, x: Int): Int = {
    if (guess == 0 || guess == x/guess) guess 
    else mySqrtGuessAlgorithm((guess+x/guess)/2, x)
  }
}

