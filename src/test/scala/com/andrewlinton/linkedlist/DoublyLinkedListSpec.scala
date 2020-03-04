package com.andrewlinton.linkedlist

import org.scalatest.FlatSpec

class DoublyLinkedListSpec extends FlatSpec {

  "DoublyLinkedList" should "be created" in {
    val list = new DoublyLinkedList[Integer](-1)
    for (i <- 0 until 100) {
      list.addAtBeginning(i)
    }

    list.insert(50, 667)

    list.interate((value: Any) => println(value))
  }

  "DoublyLinkedList" should "delete" in {
    val list = new DoublyLinkedList[Integer](-1)
    for (i <- 0 until 100) {
      list.addAtBeginning(i)
    }

    list.delete(45)

    list.interate((value: Any) => println(value))
  }

  "DoublyLinkedList" should "find" in {
    val list = new DoublyLinkedList[Integer](-1)
    for (i <- 0 until 100) {
      list.addAtBeginning(i)
    }

    val result = list.find(34)
    assert(result != null)
  }

  "DoublyLinkedList" should "find before" in {
    val list = new DoublyLinkedList[Integer](-1)
    for (i <- 0 until 100) {
      list.addAtBeginning(i)
    }

    val result = list.findCellBefore(46)
    assert(result != null)
    println(result)
  }

}
