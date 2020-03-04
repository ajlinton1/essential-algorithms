package com.andrewlinton.linkedlist

class DoublyLinkedList[T <: AnyRef](defaultValue: T) extends LinkedListTrait[T] {
  var sentinelTop = new DoubleCell[T](defaultValue, null, null);
  var sentinelBottom = new DoubleCell[T](defaultValue, sentinelTop, null);
  sentinelTop.next = sentinelBottom

  override def addAtBeginning(value: T): Unit = {
    val cell = new DoubleCell[T](value, sentinelTop, sentinelTop.next)
    sentinelTop.next = cell;
  }

  override def addAtEnd(value: T): Unit = {
    val cell = new DoubleCell[T](value, sentinelBottom.previous, sentinelBottom)
    sentinelBottom.previous.next = cell
  }

  override def insert(after: T, value: T): Unit = {
    var p = sentinelTop
    while (p.next != sentinelBottom && p.next.value != after) {
      p = p.next
    }
    if (p.next == sentinelBottom) {
      val cell = new DoubleCell[T](value, p, p.next);
      p.next = cell;
    } else {
      val cell = new DoubleCell[T](value, p.next, p.next.next);
      p.next.next = cell
    }
  }

  override def delete(target: T): Unit = {
    var p = sentinelTop
    while (p.next != sentinelBottom && p.next.value != target) {
      p = p.next
    }
    if (p.next != sentinelBottom) {
      p.next = p.next.next;
    }
  }

  override def interate(f: T => Unit): Unit = {
    var p = sentinelTop
    while (p.next != sentinelBottom) {
      f(p.next.value)
      p = p.next
    }
  }

  override def find(target: T): T = {
    var p = sentinelTop
    while (p.next != sentinelBottom) {
      if (p.next.value == target) {
        return p.next.value
      }
      p = p.next
    }
    return sentinelBottom.value
  }

  override def findCellBefore(target: T): T = {
    var p = sentinelTop
    while (p.next != sentinelBottom) {
      if (p.next.value == target) {
        return p.value
      }
      p = p.next
    }
    return sentinelBottom.value
  }
}
