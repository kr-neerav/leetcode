package com.scala.leetcode.problem0058 
import org.scalatest.flatspec._
import org.scalatest.matchers.should._

class problem0058Test extends AnyFlatSpec with Matchers{
  "Length of Last Word" should "return corret value for valid input" in  {
    //arrange 
    val s = "a valid string"
    
    //act 
    val result = Solution.lengthOfLastWord(s)
    
    //assert
    result shouldBe 6
  }

  it should "return length of string if no space is present" in {
    //arrange 
    val s = "nospacestring"
    
    //act 
    val result = Solution.lengthOfLastWord(s)
    
    //assert
    result shouldBe 13
  }

  it should "calculate length of last word after removing leading/trailing spaces" in {
    //arrange 
    val s = "  sample string  with leading/trailing spaces  "
    
    //act 
    val result = Solution.lengthOfLastWord(s)
    
    //assert
    result shouldBe 6
  }
  
}
