package com.scala.leetcode.problem0001
import org.scalatest.funsuite.AnyFunSuite


class problem0001Test extends AnyFunSuite{
  test("returns (0,1) for a 2 element array") {

    //arrange
    val inArr = Array(1,3)
    val target = 4

    //act
    val result = Solution.twoSum(inArr,target)
    
    //assert
    assert(result.sorted sameElements Array(0,1))
  }

  test("returns correct answer if target can be summed up from 2 elements with same value ") {
    //arrange
    val inArr = Array(12,4,1,5,6,4,14,30,50,100,23,54,66)
    val target = 8

    //act 
    val result = Solution.twoSum(inArr, target)

    //assert 
    assert(result.sorted sameElements Array(1,5))
  }
}
