package com.scala.leetcode.problem0069
import org.scalatest.flatspec._
import org.scalatest.matchers.should._

class problem0069Test extends AnyFlatSpec with Matchers{
  "Sqrt(x)" should "return 1 when input is 1" in  {
    //arrange 
    val x = 1
    
    //act 
    val result = Solution.mySqrt(x)
    
    //assert
    result shouldBe 1 
  }

  it should "return 0 for 0" in {
    //arrange 
    val x = 0
    
    //act 
    val result = Solution.mySqrt(x)
    
    //assert
    result shouldBe 0 
  }

  it should "return correct result for valid input" in {
    //arrange 
    val x = 81 
    
    //act 
    val result = Solution.mySqrt(x)
    
    //assert
    result shouldBe 9 
  }

  it should "return truncated value for a number that is not a square number" in {
    //arrange 
    val x = 13 
    
    //act 
    val result = Solution.mySqrt(x)
    
    //assert
    result shouldBe 3 
  }
}
