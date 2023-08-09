package com.scala.leetcode.problem0118

object Solution {
  def generate(numRows: Int): List[List[Int]] = {
    pascalTriangle(2, numRows,List(List(1,1), List(1))).reverse
  }

  //generate pascal triangle recursively
  //the first 2 rows are hardcoded
  //also generate the pascal triangle in reverse order 
  //to leverage list optimization of appendding at beginning
  private def pascalTriangle(num: Int, numRows: Int, pTriangle: List[List[Int]]): List[List[Int]] = {
    if (numRows == 1) List(List(1))
    else if (numRows == 2) List(List(1,1), List(1))
    else if (num == numRows) pTriangle
    else pascalTriangle(num + 1, numRows, getNextRow(pTriangle.head)::pTriangle)
  }

  //get the next row in pascal triangle given current row
  //uses sliding function to add numbers for next row
  private def getNextRow(currentRow: List[Int]): List[Int] = {
    List(1) ++ currentRow.sliding(2).map{case(List(x,y)) => x + y}.toList ++ List(1)
  } 
}

