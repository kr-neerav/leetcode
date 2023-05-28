package com.scala.leetcode.problem0001

import scala.collection.mutable 


object Solution {
  //customized map for two sum problem
  //searches for target - element in map but inserts the element and idx if not found
  def searchElseInsert(target: Int, defaultValue: Int): (Int, Int)=> Int = {
    val store = mutable.Map.empty[Int, Int]

    def g(k:Int, v: Int) = store.get(target - k) match {
      case Some(y) => y
      case None => {
        store(k) = v
        defaultValue
      }
    }

    g
  }


  //optimized lookup with memonization solution O(n) time complexity and O(n) space complexity
  //additional optimization to stop memonization once a solution has been identified
  //however the entire input array will be looped as that is the default behavior of HOF foldLeft
  def twoSum(nums: Array[Int], target:Int): Array[Int] = {
    val f = searchElseInsert(target,-1)

    //for the given element if solution exists then do not process and hence stop further memonization
    //if the solution is not present then process the current element to find a solution
    def findSolutionAsOption(sol: Option[(Int,Int)], elementWithIdx: (Int, Int)): Option[(Int, Int)] = sol match {
      case None => {
        val (value, idx) = elementWithIdx
        val idx2 = f(value, idx)
        if (idx2 == -1) None else Some((idx, idx2))
      }
      case _ => sol
    }

    val Some((idx1,idx2))= nums
      .zipWithIndex
      //generate index pairs for elements in array corresponding to (value, target - value)
      //where value is each element of the array
      .foldLeft(None)(findSolutionAsOption): @unchecked
    Array(idx1,idx2)
  }

  //optimized lookup with memonization solution O(n) time complexity and O(n) space complexity
  def twoSumMemonization(nums: Array[Int], target:Int): Array[Int] = {
    val f = searchElseInsert(target,-1)
    val Array((idx1,idx2))= nums
      .zipWithIndex
      //generate index pairs for elements in array corresponding to (value, target - value)
      //where value is each element of the array
      .map {case (value, idx) => (idx,f(value, idx))}
      .filter { case (idx1, idx2) => idx2 != -1}
    Array(idx1,idx2)
  }


  //non optimized solution O(n^2)
  def twoSumNonOptimized(nums: Array[Int], target:Int): Array[Int] = {
    val Array((idx1,idx2))= nums
      .zipWithIndex
      //generate index pairs for elements in array corresponding to (value, target - value)
      //where value is each element of the array
      .map {case (value, idx) => (idx, nums.indexOf(target - value, from=idx+1))}
      .filter { case (idx1, idx2) => idx2 != -1}
    Array(idx1,idx2)
  }


}
