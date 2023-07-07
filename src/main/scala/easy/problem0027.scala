package com.scala.leetcode.problem0027

object Solution {
  def removeElement(nums: Array[Int], `val`: Int): Int = {
    if (nums.length == 0) 0 else removeElementRecursive(nums, 0, nums.length -1, `val`) 
  }


  //can shorten syntax further by making it a local function fo removeElement function
  //however skipping refactoring
  //have a runner from the beginning and end of the array and swap elements whenever you encounter the value to be removed
  private def removeElementRecursive(nums: Array[Int], leftIdx: Int, rightIdx: Int, removeVal: Int): Int= {
    if(leftIdx >= rightIdx) leftIdx + 1
    else if (nums(leftIdx) != removeVal) removeElementRecursive(nums,leftIdx + 1, rightIdx, removeVal)
    else {
      swap(nums, leftIdx, rightIdx)
      removeElementRecursive(nums, leftIdx, rightIdx - 1, removeVal)
    }
  }

  //swap element in array at index i and j
  private def swap(nums: Array[Int], i: Int, j: Int): Unit = {
    val tmp = nums(i)
    nums(i) = nums(j)
    nums(j) = nums(i)
  }
}
