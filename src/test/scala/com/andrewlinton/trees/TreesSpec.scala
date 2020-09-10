package com.andrewlinton.trees

import org.scalatest.flatspec.AnyFlatSpec

class TreesSpec extends AnyFlatSpec {

  "Tree" should "be created" in {
    /*
    BinaryNode: root = New BinaryNode("4")
BinaryNode: node1 = New BinaryNode("1")
BinaryNode: node2 = New BinaryNode("2")
BinaryNode: node3 = New BinaryNode("3")
BinaryNode: node5 = New BinaryNode("5")
BinaryNode: node6 = New BinaryNode("6")
BinaryNode: node7 = New BinaryNode("7")
BinaryNode: node8 = New BinaryNode("8")
root.LeftChild = node2
root.RightChild = node5
node2.LeftChild = node1
node2.RightChild = node3
node5.RightChild = node7
node7.LeftChild = node6
node7.RightChild = node8
     */

    val root = new BinaryNode("4")
    val node1 = new BinaryNode("1")
    val node2 = new BinaryNode("2")
    val node3 = new BinaryNode("3")
    val node5 = new BinaryNode("5")
    val node6 = new BinaryNode("6")
    val node7 = new BinaryNode("7")
    val node8 = new BinaryNode("8")
    root.leftNode = node2
    root.rightNode = node5
    node2.leftNode = node1
    node2.rightNode = node3
    node5.rightNode = node7
    node7.leftNode = node6
    node7.rightNode = node8

    root.preorderTraversal()
    println()
    root.inorderTraversal()
    println()
    root.postorderTraversal()
    println()
    root.traverseDepthFirst()
  }

}
