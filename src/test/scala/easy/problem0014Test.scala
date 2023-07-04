package com.scala.leetcode.problem0014
import org.scalatest.flatspec._
import org.scalatest.matchers.should._

class problem0014Test extends AnyFlatSpec with Matchers{
  "Longest Common Prefix" should "be less than minimum length of string" in  {
    //arrange 
    val strs = Array("my first string", "my second string", "my third string")
    
    //act 
    val result = Solution.longestCommonPrefix(strs)

    //assert
    result.length should be <= strs.map(_.length).min
  }

  it should " be at the beginning of each string" in {
    //arange 
    val strs = Array("my first string", "my second string", "my third string")
    
    //act 
    val result = Solution.longestCommonPrefix(strs)
    
    //assert
    val allBeginWithPrefixFlag = strs.map(_.startsWith(result)).reduce(_ && _)
    allBeginWithPrefixFlag shouldBe true
  }

  it should "be the string if Array has only 1 string" in {
    // arrange 
    val strs = Array("only String")

    //act 
    val result = Solution.longestCommonPrefix(strs)

    //assert
    result shouldBe strs(0)
  }

  it should "be an empty string if there is no common prefix" in {
    //arrange 
    val strs = Array("first string", "second string")

    //act 
    val result = Solution.longestCommonPrefix(strs)

    //assert
    result shouldBe ""

  }

}
