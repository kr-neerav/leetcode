package com.scala.leetcode.problem0067

object Solution {
  def addBinary(a: String, b: String): String = {
    addBinaryRecursive(a.reverse, b.reverse, "", '0')
  }

  private def addBinaryRecursive(a: String, b: String, output: String, carry: Char): String = (a,b,carry) match {
    case ("", "", '0') => output 
    case ("", "", '1') => carry + output 
    case ("", b, carry) => addBinaryRecursive(a.tail, b.tail,getRemainder('0', b.head, carry) + output, getCarry('0', b.head, carry))
    case (a, "", carry) => addBinaryRecursive(a.tail, b.tail,getRemainder(a.head, '0', carry) + output, getCarry(a.head, '0', carry))
    case  _ => addBinaryRecursive(a.tail, b.tail,getRemainder(a.head, b.head, carry) + output, getCarry(a.head, b.head, carry))
  }

  private def getCarry(a: Char, b: Char, c: Char): Char = (a.toString + b.toString + c.toString) match {
    case "000"|"001"|"010"|"100" => '0'
    case _ => '1'
  }

  private def getRemainder(a: Char, b: Char, c: Char): Char = (a.toString + b.toString + c.toString) match {
    case "111"|"001"|"010"|"100" => '1'
    case _ => '0'
  }
}

