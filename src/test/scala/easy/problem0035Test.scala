package com.scala.leetcode.problem0035 
import org.scalatest.flatspec._
import org.scalatest.matchers.should._

class problem0028Test extends AnyFlatSpec with Matchers{
  "Search Insert" should "return an index between 0 and length -1" in  {
    //arrange 
    val nums = Array(1,2,3,4,5)
    val target = 2

    //act 
    val result = Solution.searchInsert(nums, target)
    
    //assert
    result should be >= 0
    result should be <= nums.length
  }

  it should "return index if value is found" in {
    //arrange 
    val nums = Array(1,2,3,4,5)
    val target = 2

    //act 
    val result = Solution.searchInsert(nums, target)
    
    //assert
    result shouldBe 1
  }

  it should "return nums.length -1 if value is > max value in array" in {
    //arrange 
    val nums = Array(1,2,3,4,5)
    val target = 8 

    //act 
    val result = Solution.searchInsert(nums, target)
    
    //assert
    result shouldBe 5 
  }

  it should "return 0 if value is less than minimun value in array" in {
    //arrange 
    val nums = Array(1,2,3,4,5)
    val target = -1 

    //act 
    val result = Solution.searchInsert(nums, target)
    
    //assert
    result shouldBe 0 
  }

  it should "return the index where value has to be inserted in array if value not found" in {
    //arrange 
    val nums = Array(1,3,5,7,9)
    val target = 4 

    //act 
    val result = Solution.searchInsert(nums, target)
    
    //assert
    result shouldBe 2 
  }
}

  

