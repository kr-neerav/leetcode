package com.scala.leetcode.problem0027  
import org.scalatest.flatspec._
import org.scalatest.matchers.should._

class problem0027Test extends AnyFlatSpec with Matchers{
  "Remove Element" should "should return value less than equal to length of array" in  {
    //arrange 
    val nums = Array(1,1,3,5)
    val removeVal = 1
    
    //act 
    val result = Solution.removeElement(nums, removeVal)
    
    //assert
    result should be <= nums.length
  }

  it should "return 0 for empty array" in {
    //arrange 
    val nums = Array[Int]()
    val removeVal = 1
    
    //act 
    val result = Solution.removeElement(nums, removeVal)
    
    //assert
    result shouldBe 0
  }

  it should "have no effect on an array where the element to be removed is not present  " in {
    //arrange
    val nums = Array(1,1,1,1)
    val removeVal = 2

    //act
    val result = Solution.removeElement(nums, removeVal)

    //assert
    result shouldBe 4
    nums.take(result) shouldBe nums
  }

  it should "remove element successfully for valid inputs" in {
    //arrange
    val nums = Array(1,1,1,1,2,2,2,3,4,5)
    val removeVal = 2

    //act
    val result = Solution.removeElement(nums, removeVal)

    //assert
    result shouldBe 7 
    nums.take(result).sorted shouldBe Array(1,1,1,1,3,4,5).sorted
  }

}

  

