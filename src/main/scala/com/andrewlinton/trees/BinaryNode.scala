package com.andrewlinton.trees

class BinaryNode(name: String) {
  var leftNode: BinaryNode = null
  var rightNode: BinaryNode = null

  def preorderTraversal(f: (BinaryNode) => Unit): Unit = {
    f(this)
    if (leftNode != null) {
      leftNode.preorderTraversal(f)
    }
    if (rightNode != null) {
      rightNode.preorderTraversal(f)
    }
  }

  def inorderTraversal(f: (BinaryNode) => Unit): Unit = {
    if (leftNode != null) {
      leftNode.inorderTraversal(f)
    }
    f(this)
    if (rightNode != null) {
      rightNode.inorderTraversal(f)
    }
  }

  def postorderTraversal(f: (BinaryNode) => Unit): Unit = {
    if (leftNode != null) {
      leftNode.postorderTraversal(f)
    }
    if (rightNode != null) {
      rightNode.postorderTraversal(f)
    }
    f(this);
  }

  def traverseDepthFirst(f: (BinaryNode) => Unit): Unit = {
    val children: scala.collection.mutable.Queue[BinaryNode] = new scala.collection.mutable.Queue[BinaryNode]()
    children.enqueue(this)
    while (children.length > 0) {
      val node = children.dequeue()
      f(node)
      if (node.leftNode != null) {
        children.enqueue(node.leftNode)
      }
      if (node.rightNode != null) {
        children.enqueue(node.rightNode)
      }
    }
  }

  def getName(): String = {
  return this.name
  }
}
