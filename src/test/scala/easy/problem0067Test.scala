package com.scala.leetcode.problem0067
import org.scalatest.flatspec._
import org.scalatest.matchers.should._

class problem0067Test extends AnyFlatSpec with Matchers{
  "Add Binary" should "return correct output for valid string" in  {
    //arrange 
    val a = "100"
    val b = "10"
    
    //act 
    val result = Solution.addBinary(a, b)
    
    //assert
    result shouldBe "110"
  }

  it should "return same string if one of the string is empty" in {
    //arrange 
    val a = ""
    val b = "10"
    
    //act 
    val result = Solution.addBinary(a, b)
    
    //assert
    result shouldBe "10"
  }

  it should "return a string with length >= max length of 2 input string " in {
    //arrange 
    val a = "11"
    val b = "10"
    
    //act 
    val result = Solution.addBinary(a, b)
    
    //assert
    result.length should be >= a.length.max(b.length)
  }

  it should "return the string with extra digit if addition has additional carry" in {
    //arrange 
    val a = "110"
    val b = "10"
    
    //act 
    val result = Solution.addBinary(a, b)
    
    //assert
    result shouldBe "1000"
  }
}
