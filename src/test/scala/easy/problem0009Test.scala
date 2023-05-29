package com.scala.leetcode.problem0009

import org.scalatest.funsuite.AnyFunSuite

class problem0009Test extends AnyFunSuite {
  test("returns true for 3") {
    assert(Solution.isPalindrome(3) == true)
  }

  test("negative numbers return false") {
    assert(Solution.isPalindrome(-181) == false)
  }

  test("returns false for Int.MinValue") {
    assert(Solution.isPalindrome(Int.MinValue) == false)
  }

  test("returns false for Int.MaxValue") {
    assert(Solution.isPalindrome(Int.MaxValue) == false)
  }

  test("return true for a palindrome with even number of digits") {
    assert(Solution.isPalindrome(345543) == true)
  }

  test("return true for a palindrome with odd number of digits") {
    assert(Solution.isPalindrome(23432) == true)
  }

  test("returns false for a number whose reverse > Int.MaxValue") {
    assert(Solution.isPalindrome(123456789) == false)
  }
}















