package com.scala.leetcode.problem0013

import org.scalatest.funsuite.AnyFunSuite

class problem0013Test extends AnyFunSuite {
  test("returns a positive number") {
    assert(Solution.romanToInt("II") > 0)
  }

  test("edge case for IV") {
    assert(Solution.romanToInt("IV") == 4)
  }

  test("edge case for IX") {
    assert(Solution.romanToInt("IX") == 9)
  }

  test("edge case for XL") {
    assert(Solution.romanToInt("XL") == 40)
  }

  test("edge case for XC") {
    assert(Solution.romanToInt("XC") == 90)
  }

  test("edge case for CD") {
    assert(Solution.romanToInt("CD") == 400)
  }

  test("edge case for CM") {
    assert(Solution.romanToInt("CM") == 900)
  }


  
}















