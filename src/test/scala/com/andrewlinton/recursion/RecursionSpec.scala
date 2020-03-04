package com.andrewlinton.recursion

import org.scalatest.flatspec.AnyFlatSpec

import scala.collection.mutable.ArrayBuffer

class RecursionSpec extends AnyFlatSpec{

  "Factorial" should "be created" in {
    val result = Factorial.factorial(1)
    println(result)

    println(Factorial.factorial(10))
  }

  "Fibonacci" should "be created" in {
    val result = Fibonacci.fibonacci(20)
    println(result)
  }

  "Rod cut" should "be created" in {
    val result = RodCutting.findOptimalCuts(30)
    println(result)
  }
}
