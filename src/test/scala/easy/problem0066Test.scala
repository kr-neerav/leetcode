package com.scala.leetcode.problem0066
import org.scalatest.flatspec._
import org.scalatest.matchers.should._

class problem0066Test extends AnyFlatSpec with Matchers{
  "Plus One" should "return array whose length is >= length of input arrray" in  {
    //arrange 
    val digits = Array(1,2,3)

    //act 
    val result = Solution.plusOne(digits)
    
    //assert
    result.length should be >= digits.length 
  }

  it should "return Array(1) if input array is empty" in {
    //arrange 
    val digits = Array[Int]()
    
    //act 
    val result = Solution.plusOne(digits)
    
    //assert
    result shouldBe Array(1)
  }

  it should "return correct result for valid input" in {
    //arrange 
    val digits = Array(2,4,5,2,5,6)
    
    //act 
    val result = Solution.plusOne(digits)
    
    //assert
    result shouldBe Array(2,4,5,2,5,7)
  }

  it should "return an array with an additional digit if all values are 9" in {
    //arrange 
    val digits = Array(9,9,9,9)
    
    //act 
    val result = Solution.plusOne(digits)
    
    //assert
    result shouldBe Array(1,0,0,0,0)
  }
}
