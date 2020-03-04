package com.andrewlinton.linkedlist

class LinkedList[T <: AnyRef](defaultValue: T) extends LinkedListTrait[T] {
  var sentinel = new Cell[T](defaultValue, null)

  def addAtBeginning(value: T): Unit = {
    var cell = new Cell[T](value, sentinel.next)
    sentinel.next = cell
  }

  def addAtEnd(value: T): Unit = {
    var p = sentinel
    while (p.next != null) {
      p = p.next
    }
    var node = new Cell[T](value, null)
    p.next = node
  }

  def insert(after: T, value: T): Unit = {
    var p = sentinel
    while (p.next != null && p.next.value != after) {
      p = p.next;
    }
    if (p.next != null) {
      var node = new Cell[T](value, p.next.next)
      p.next.next = node
    }
  }

  def delete(target: T): Unit = {
    var p = sentinel
    while (p.next != null && p.next.value != target) {
      p = p.next
    }
    if (p.next != null) {
      p.next = p.next.next;
    }
  }

  def interate(f:(T => Unit)) = {
    var p = sentinel
    while (p.next != null) {
      f(p.next.value)
      p = p.next
    }
  }

  def find(target: T): T = {
    var p = sentinel
    while (p !=null) {
      if (p.value == target) {
        return p.value
      }
      p = p.next
    }
    throw new Exception("Not found")
  }

  def findCellBefore(target: T): T = {
    var p = sentinel;
    while (p.next != null) {
      if (p.next.value == target) {
        return p.value
      }
      p = p.next
    }
    throw new Exception("Not found")
  }
}
