package com.scala.leetcode.problem0058

object Solution {
  def lengthOfLastWord(s: String): Int = {
    val trimmedStr = s.trim
    trimmedStr.length - idxOfSpaceFromEnd(trimmedStr, trimmedStr.length -1)
  }

  private def idxOfSpaceFromEnd(s: String, idx: Int): Int = {
    if (idx == -1 || s(idx) == ' ') idx+1 else idxOfSpaceFromEnd(s,idx -1)
  }
}

