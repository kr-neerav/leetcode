package com.scala.leetcode.problem0028 
import org.scalatest.flatspec._
import org.scalatest.matchers.should._

class problem0028Test extends AnyFlatSpec with Matchers{
  "Needle in Haystack" should "should return -1 if needle not present in haystack" in  {
    //arrange 
    val needle = "abc"
    val haystack = "defghijkl"
    
    //act 
    val result = Solution.strStr(haystack, needle)
    
    //assert
    result shouldBe -1
  }

  it should "find the first occurence of a needle" in {
    //arrange 
    val needle = "abc"
    val haystack = "defabcghijklabcabc"
    
    //act 
    val result = Solution.strStr(haystack, needle)
    
    //assert
    result shouldBe 3
  }

  it should "return -1 if needle length if > haystack length" in {
    //arrange 
    val needle = "abc"
    val haystack = "ab"
    
    //act 
    val result = Solution.strStr(haystack, needle)
    
    //assert
    result shouldBe  -1
  }

  it should "return the first occurence of needle in case of overlapping needles" in {
    //arrange 
    val needle = "aa"
    val haystack = "aaa"
    
    //act 
    val result = Solution.strStr(haystack, needle)
    
    //assert
    result shouldBe 0 
  }
}

  

