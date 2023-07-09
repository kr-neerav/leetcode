package com.scala.leetcode.problem0035

object Solution {
  def searchInsert(nums: Array[Int], target: Int): Int = {
    def binSearch(leftIdx: Int, rightIdx: Int): Int = {
      val mid = (leftIdx + rightIdx)/2
      if (rightIdx < leftIdx) leftIdx  
      else if (nums(mid) == target) mid 
      else if (nums(mid) < target) binSearch(mid + 1, rightIdx)
      else binSearch(leftIdx, mid -1)
    }

    binSearch(0, nums.length -1)
  }
}

