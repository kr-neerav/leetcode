package com.scala.leetcode.problem0028

object Solution {
  def strStr(hayStack: String, needle: String): Int = {
    val needleL = needle.length
        /*
        recursively search for the needle in the haystack. Since its a local function no need to pass needle parameter.
        Search for needle at the beginning of the haystack and if not found then recursively search in the tail of haystack.
        idx is used to track the index of the tail in the original haystack
        Some of the optimizations are
        1) check if the haystack length is not less than needle length. Searching beyond this is meaningless.
        2) before getting the slice out of haystack check if the first character matches. Used && instead of &
        3) For the edge case mentioned in the questions of needle being empty checked it before calling recursive function.
        */
        def recursiveStrStr(haystack: String, idx: Int): Int = {
            if (haystack.length >= needleL) {
                if (needle(0) == haystack(0) && haystack.slice(0, needleL) == needle) idx
                else recursiveStrStr(haystack.tail, idx + 1)
            }
            else -1
        }
        if (needleL == 0) 0 else recursiveStrStr(hayStack, 0)  //for the edge case of needle being empty
  }

  //creating a sliding string of length same as needle for each index in haystack
  //compare the sliding string
  //O(mxn)
  private def inefficientSearch(haystack: String, needle: String): Int = {
    val needleSearch = haystack.sliding(needle.length).zipWithIndex.map{case (s, idx) => (s == needle, idx)}.filter{case (flag, idx) => flag}.toList
    if (needleSearch.length == 0) -1 else needleSearch(0)._2
  }
}

