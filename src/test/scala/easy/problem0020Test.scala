package com.scala.leetcode.problem0020
import org.scalatest.flatspec._
import org.scalatest.matchers.should._

class problem0020Test extends AnyFlatSpec with Matchers{
  "Valid parethesis" should "return false for odd number of parenthesis" in  {
    //arrange 
    val s = "{[]}]"
    
    //act 
    val result = Solution.isValid(s)

    //assert
    result shouldBe false
  }

  it should "be true for empty string" in {
    //arrange 
    val s = ""
    
    //act 
    val result = Solution.isValid(s)

    //assert
    result shouldBe true  
  }

  it should "return true for valid expression" in {
    //arrange 
    val s = "[{{}}({})]"
    
    //act 
    val result = Solution.isValid(s)

    //assert
    result shouldBe true  
  }

  it should "return false for an invalid expression" in {
    //arrange 
    val s = "[{{}({})]"
    
    //act 
    val result = Solution.isValid(s)

    //assert
    result shouldBe false
  }
}
