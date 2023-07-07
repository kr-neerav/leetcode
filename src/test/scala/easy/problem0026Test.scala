package com.scala.leetcode.problem0026  
import org.scalatest.flatspec._
import org.scalatest.matchers.should._

class problem0026Test extends AnyFlatSpec with Matchers{
  "Remove Duplicates" should "should return value less than equal to length of array" in  {
    //arrange 
    val nums = Array(1,1,3,5)
    
    //act 
    val result = Solution.removeDuplicates(nums)
    //assert
    result should be <= nums.length
  }

  it should "return 1 for array with all elements same" in {
    //arrange
    val nums = Array(1,1,1,1)

    //act
    val result = Solution.removeDuplicates(nums)

    //assert
    result shouldBe 1  
    nums.take(result) shouldEqual Array(1)
  }

  it should "return 0 for empty array" in {
    //arrange
    val nums = Array[Int]()

    //act
    val result = Solution.removeDuplicates(nums)

    //assert
    result shouldBe 0 
  }

  it should "return correct array for a valid input" in {
    //arrange
    val nums = Array(1,1,3,3,4,4,4,5,6)

    //act
    val result = Solution.removeDuplicates(nums)

    //assert
    result shouldBe 5
    nums.take(result) shouldEqual Array(1,3,4,5,6)
  }
}

  

