package com.scala.leetcode.problem0070
import org.scalatest.flatspec._
import org.scalatest.matchers.should._

class problem0069Test extends AnyFlatSpec with Matchers{
  "climbStairs(x) " should "return 1 when input is 1" in  {
    //arrange 
    val x = 1
    
    //act 
    val result = Solution.climbStairs(x)
    
    //assert
    result shouldBe 1 
  }

  it should "return 2 for 2" in {
    //arrange 
    val x = 2
    
    //act 
    val result = Solution.climbStairs(x)
    
    //assert
    result shouldBe 2
  }

  it should "validate property of fibonacci series for large numbers like 45" in {
    //arrange 
    val x = 45 
    
    //act 
    val result = Solution.climbStairs(x)
    val vMinusOne = Solution.climbStairs(x-1)
    val vMinusTwo = Solution.climbStairs(x-2)
    
    //assert
    result shouldBe (vMinusOne + vMinusTwo) 
  }
}
