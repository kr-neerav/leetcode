package com.scala.leetcode.problem0009

object Solution {

  //returns the number of digits in a number
  private def numOfDigits(n: Int): Int = {
    if (n/10 == 0) 1 else numOfDigits(n/10)+1
  }

  //reverses the number for last n digits
  private def reverseLastnDigits(num: Int, reverseNum: Int,  ndigits: Int): (Int, Int) = {
    if (ndigits == 0) (num, reverseNum)
    else reverseLastnDigits(num/10, reverseNum*10+num%10, ndigits -1)
  }

  def isPalindrome(x: Int): Boolean = {
    if (x < 0) false 
    else {
      //reverse the number from right till half the number of digits are reached
      //and compare them to identify if its a palindrome. For number with odd number of digits 
      //drop the middle digits before comparison
      val ndigits = numOfDigits(x)
      val (num, reverseNum) = reverseLastnDigits(x,0,ndigits/2)
      val fnlNum = if (ndigits%2 ==0) num else num/10
      reverseNum == fnlNum
    }
  }
}
