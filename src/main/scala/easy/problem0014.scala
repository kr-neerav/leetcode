package com.scala.leetcode.problem0014

object Solution {
  def longestCommonPrefix(strs: Array[String]): String = {
    //longestCommonPrefixSliceHorizontal(strs)
    val longestCommonPrefixLength = longestCommonPrefixSliceVertical(strs,0)
    strs(0).take(longestCommonPrefixLength + 1)
  }

  private def longestCommonPrefixSliceHorizontal(strs: Array[String]): String = {
    strs.reduce(longestCommonPrefix2Strings)
  }

  private def longestCommonPrefixSliceVertical(strs: Array[String], idx: Int): Int= {
    val numDistinctCharsAtIdx = strs.map(getValAtIdx(_,idx)).distinct.length 
    if (numDistinctCharsAtIdx == 1 && idx < strs(0).length) longestCommonPrefixSliceVertical(strs,idx+1)
    else idx -1
  }

  //function to handle extracting value from string when index is outside the string 
  private def getValAtIdx(str: String, idx: Int): Option[Char] = if (idx < str.length) Some(str(idx)) else None

  private def longestCommonPrefix2Strings(str1: String, str2: String): String = {
    //zip the 2 strings together and extract the part from beginning when both characters are same
    //recreate the common prefix from the extracted part above
    str1.zip(str2)
      .takeWhile {case (c1, c2) => c1 == c2}
      .map {case (c1, c2) => c2}
      .mkString
  }
}
