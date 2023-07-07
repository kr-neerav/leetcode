package com.scala.leetcode.problem0026

object Solution {
  def removeDuplicates(nums: Array[Int]): Int = {
    if (nums.length == 0) 0 else removeDuplicateRecursive(nums, 0,0) 
  }


  private def removeDuplicateRecursive(nums: Array[Int], slowRunner: Int, fastRunner: Int): Int= {
    if (fastRunner == nums.length) slowRunner + 1
    else if (nums(slowRunner) == nums(fastRunner)) removeDuplicateRecursive(nums, slowRunner, fastRunner+1)
    else {
      nums(slowRunner + 1) = nums(fastRunner)
      removeDuplicateRecursive(nums, slowRunner + 1, fastRunner + 1)
    }
  }
}
