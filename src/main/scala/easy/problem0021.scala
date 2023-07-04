package com.scala.leetcode.problem0021
import com.scala.leetcode.utils.ListNode

object Solution {
  def mergeTwoLists(list1: ListNode, list2: ListNode): ListNode = {
    val fnlList = new ListNode()
    mergeTwoListsPrivate(list1, list2,fnlList)
    fnlList.next //the merged list starts from the tail of the fnlList as we created a dummy head for processing
  }


  private def mergeTwoListsPrivate(list1: ListNode, list2: ListNode, lastNode: ListNode): Unit = (list1, list2) match {
    //if either of the list is empty then merge the remaining of the other list into the final list
    case (list1, null) => lastNode.next = list1
    case (null, list2) => lastNode.next = list2
    case (null, null) => //no action required 
    //remove the smallest element from the head of the 2 lists and merge into the final list
    case _ => {
      if (list1.x <= list2.x) {
        lastNode.next = list1 
        mergeTwoListsPrivate(list1.next, list2, lastNode.next)
        }
      else {
        lastNode.next = list2 
        mergeTwoListsPrivate(list1, list2.next, lastNode.next)
      }
    }
  }
}
