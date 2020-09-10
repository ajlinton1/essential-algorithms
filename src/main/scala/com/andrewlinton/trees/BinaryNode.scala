package com.andrewlinton.trees

class BinaryNode(name: String) {
  var leftNode: BinaryNode = null
  var rightNode: BinaryNode = null

  def preorderTraversal(): Unit = {
    println(name)
    if (leftNode != null) {
      leftNode.preorderTraversal()
    }
    if (rightNode != null) {
      rightNode.preorderTraversal()
    }
  }

  def inorderTraversal(): Unit = {
    if (leftNode != null) {
      leftNode.preorderTraversal()
    }
    println(name)
    if (rightNode != null) {
      rightNode.preorderTraversal()
    }
  }

  def postorderTraversal(): Unit = {
    if (leftNode != null) {
      leftNode.preorderTraversal()
    }
    if (rightNode != null) {
      rightNode.preorderTraversal()
    }
    println(name)
  }

  def traverseDepthFirst(): Unit = {
/*    val children: scala.collection.mutable.Queue[BinaryNode] = new scala.collection.mutable.Queue[BinaryNode]()
    children.enqueue(this)
    while (!children.front==null) {
      val node = children.dequeue()
      println(node.name)
      if (leftNode != null) {
        children.enqueue(leftNode)
      }
      if (rightNode != null) {
        children.enqueue(rightNode)
      }
    } */
  }
}
