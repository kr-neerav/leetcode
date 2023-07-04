package com.scala.leetcode.problem0013

object Solution {

  private val romanIntLkp = List(('I',1),('V',5),('X',10),('L',50),('C',100),('D',500),('M',1000)).toMap

  private def romanToIntRecursive(inpt: List[Char]): Int = inpt match {
    case Nil => 0
    case 'I'::'V'::tail => 4 + romanToIntRecursive(tail)
    case 'I'::'X'::tail => 9 + romanToIntRecursive(tail)
    case 'X'::'L'::tail => 40 + romanToIntRecursive(tail)
    case 'X'::'C'::tail => 90 + romanToIntRecursive(tail)
    case 'C'::'D'::tail => 400 + romanToIntRecursive(tail)
    case 'C'::'M'::tail => 900 + romanToIntRecursive(tail)
    case h::tail => romanIntLkp(h) + romanToIntRecursive(tail)
  } 

  def romanToInt(s: String): Int = {
    romanToIntRecursive(s.toList) 
  }
}
