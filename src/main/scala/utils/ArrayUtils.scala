package com.scala.leetcode.utils

import scala.collection.mutable

object ArrayUtils {
  def memonizedArrayIndexSearch[A](inArr: Array[A], element: A, fromIdx: Int): A=>Int = {
    val store = mutable.Map.empty[A,Int]

    def g(x: A): Int = store.get(x) match {
      case Some(y) => y
      case None => {
        val y = inArr.indexOf(element, from=fromIdx)
        store(x) = y
        y
      }
    }

    g
  }
} 
