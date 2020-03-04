package com.andrewlinton.linkedlist

trait LinkedListTrait[T <: AnyRef] {

  def addAtBeginning(value: T)

  def addAtEnd(value: T)

  def insert(after: T, value: T)

  def delete(target: T)

  def interate(f:(T => Unit))

  def find(target: T): T

  def findCellBefore(target: T): T
}
