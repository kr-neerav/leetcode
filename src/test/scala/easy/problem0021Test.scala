package com.scala.leetcode.problem0021
import org.scalatest.flatspec._
import org.scalatest.matchers.should._
import com.scala.leetcode.utils.ListNode

class problem0021Test extends AnyFlatSpec with Matchers{
  //function to convert a scala List to a ListNode. Used for testing.
  private def listToListNode(l: List[Int]): ListNode = {
    l.reverse.foldLeft(null)(addNodeToList)
  }

  //function to add a node to a given ListNode. used in fold operation to convert a List of Ints to ListNode  
  private def addNodeToList(xs: ListNode, x: Int): ListNode = {
    ListNode(x, xs)
  }

  //convert a ListNode back to scala List. Used for testing
  private def listNodeToList(l: ListNode): List[Int] = {
    if (l == null) Nil else l.x::listNodeToList(l.next)
  }

  "Merge Sorted List" should "returns correct result for 2 not null lists" in  {
    //arrange 
    val l1 = List(1,2,3,4)
    val l2 = List(2,4,6,8)
    
    //act 
    val result = Solution.mergeTwoLists(listToListNode(l1),listToListNode(l2))

    //assert
    listNodeToList(result) shouldBe (l1 ++ l2).sorted
  }

  it should "return one of the lists if the other list is null" in {
    //arrange 
    val l1 = List(1,2,3,4)
    val l2 = List[Int]()
    
    //act 
    val result = Solution.mergeTwoLists(listToListNode(l1),listToListNode(l2))

    //assert
    listNodeToList(result) shouldBe l1 
  }


  it should "return null if both lists are null" in {
    //arrange 
    val l1 = List[Int]()
    val l2 = List[Int]()
    
    //act 
    val result = Solution.mergeTwoLists(listToListNode(l1),listToListNode(l2))

    //assert
    result shouldBe null 
  }
}
