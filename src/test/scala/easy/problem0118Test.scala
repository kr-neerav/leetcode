package com.scala.leetcode.problem0118
import org.scalatest.flatspec._
import org.scalatest.matchers.should._

class problem0118Test extends AnyFlatSpec with Matchers{
  "generate(numRows) " should "return List(List(1)) when input is 1" in  {
    //arrange 
    val numRows = 1
    
    //act 
    val result = Solution.generate(numRows)
    
    //assert
    result shouldBe List(List(1)) 
  }

  it should "return correct result for a 3 rows" in {
    //arrange 
    val numRows =  3
    
    //act 
    val result = Solution.generate(numRows)
    
    //assert
    result shouldBe List(List(1), List(1,1), List(1,2,1)) 
  }
}
