package com.andrewlinton.recursion

import org.scalatest.flatspec.AnyFlatSpec

class RecursionSpec extends AnyFlatSpec{

  "Factorial" should "be created" in {
    val result = Factorial.factorial(1)
    println(result)

    println(Factorial.factorial(10))
  }

  "Fibonacci" should "be created" in {
    val fibonacci = new Fibonacci()
    val result = fibonacci.fibonacci(10)
    println(result)
    assert(result == 55)
  }

  "Fibonacci dynamic" should "be created" in {
    val fibonacci = new Fibonacci()
    val result = fibonacci.fibonacciDynamic(10)
    println(result)
    assert(result == 55)
  }

  "Fibonacci no recursion" should "be created" in {
    val fibonacci = new Fibonacci()
    val result = fibonacci.noRecursion(10)
    println(result)
    assert(result == 55)
  }

  "Rod cut" should "be created" in {
    val result = RodCutting.findOptimalCuts(30)
    println(result)
  }

  "Factorial non-recursive" should "be created" in {
    val result = Factorial.noRecursive(10)
    println(result)
  }
}

