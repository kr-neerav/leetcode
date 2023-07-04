package com.scala.leetcode.problem0020
import com.scala.leetcode.utils.Stack

object Solution {
  val correspondingBracketMap = List(('}','{'), (']', '['), (')', '(')).toMap
  val openingBrackets = Set('{', '[', '(')

  def isValid(s: String): Boolean = {
    val stck = new Stack[Char]
    isValidRecusrive(stck,s)
  }

  def isValidRecusrive(stck: Stack[Char], s: String): Boolean =  {
    //4 decision criteria
    //if the entire string is parsed successfully but stack still has values then invalid string
    //if you encounter an opening brackets push it on the stack and continue parsing
    //if you encounter a closing braces and stack is empty or the top value of stack does not match the corresponding brackets then false
    //continue parsing
    if (s == "") stck.length() == 0
    else if (openingBrackets contains s.head) {
      stck.push(s.head)
      isValidRecusrive(stck,s.tail)
    }
    else if (stck.length() == 0 || correspondingBracketMap(s.head) != stck.topValue().get) false
    else {
      stck.pop()
      isValidRecusrive(stck, s.tail)
    } 
  }

}
