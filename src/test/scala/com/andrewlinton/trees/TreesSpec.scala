package com.andrewlinton.trees

import org.scalatest.flatspec.AnyFlatSpec

class TreesSpec extends AnyFlatSpec {

  "Tree" should "be created" in {

    val processNode = (node: BinaryNode) => {
      println(node.getName())
    }

    val root = createTree()

    root.preorderTraversal(processNode)
    println()
/*    root.inorderTraversal(f)
    println()
    root.postorderTraversal(f)
    println()
    root.traverseDepthFirst(f) */
  }

  val processNode = (node: BinaryNode) => {
    println(node.getName())
  }

  "preorder" should "be traversed" in {
    val root = createTree()
    root.preorderTraversal(processNode)
  }

  "inorder" should "be traversed" in {
    val root = createTree()
    root.inorderTraversal(processNode)
  }

  "postorder" should "be traversed" in {
    val root = createTree()
    root.postorderTraversal(processNode)
  }

  "depthFirst" should "be traversed" in {
    val root = createTree()
    root.traverseDepthFirst(processNode)
  }

  def createTree(): BinaryNode = {
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
    root
  }

}
