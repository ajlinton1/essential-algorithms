package com.andrewlinton.linkedlist

import org.scalatest.FlatSpec

class LinkedListSpec extends FlatSpec {

  "LinkedList" should "be created" in {
    val linkedList = new LinkedList[Integer](-1)
    for (i <- 0 until 100) {
      linkedList.addAtEnd(i)
    }
    linkedList.interate((value: Any) => println(value))

    val findResult = linkedList.find(33)
    assert(findResult != null)
    assert(findResult == 33)

    val findBeforeResult = linkedList.findCellBefore(99)
    assert(findBeforeResult != null)
    assert(findBeforeResult == 98)
  }

  "LinkedList class" should "be created" in {
    val linkedList = new LinkedList[Integer](-1)
    for (i <- 0 to 100) {
      linkedList.addAtBeginning(i)
    }
    linkedList.interate((value: Any) => println(value))
  }

  "LinkedList class" should "be created at end" in {
    val linkedList = new LinkedList[Integer](-1)
    for (i <- 0 to 100) {
      linkedList.addAtEnd(i)
    }
    linkedList.interate((value: Any) => println(value))
  }

  "LinkedList class" should "insert in middle" in {
    val linkedList = new LinkedList[Integer](-1)
    for (i <- 0 to 100) {
      linkedList.addAtEnd(i)
    }
    linkedList.insert(50, 234)

    linkedList.interate((value: Any) => println(value))
  }

  "LinkedList class" should "delete" in {
    val linkedList = new LinkedList[Integer](-1)
    for (i <- 0 to 100) {
      linkedList.addAtEnd(i)
    }
    linkedList.delete(50)

    linkedList.interate((value: Any) => println(value))
  }

}
