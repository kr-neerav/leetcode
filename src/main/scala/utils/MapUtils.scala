package com.scala.leetcode.utils

import scala.collection.mutable

object MapUtils {
  //search for an element in a map. if found return the value
  //if not found insert the key value in map and return the default value
  def searchElseInsertKeyValue[A,B](defaultResult:B): (A,B)=>B = {
    val store = mutable.Map.empty[A,B]

    def g(k:A,v:B): B = store.get(k) match {
      case Some(y) => y
      case None => {
        store(k) = v
        defaultResult
      }
    }

    g
  }
}
