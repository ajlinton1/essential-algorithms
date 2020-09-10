package com.andrewlinton.recursion

class Fibonacci {
  var fibonacciValues = new Array[Int](100)
  var maxN = 1
  fibonacciValues(0) = 0;
  fibonacciValues(1) = 1;

  def fibonacci(n: Int): Int = {
    if (n <= 1) {
      return n
    }
    return fibonacci(n - 1) + fibonacci(n - 2)
  }

  def fibonacciDynamic(n: Int): Int = {
    if (maxN < n) {
      fibonacciValues(n) = fibonacciDynamic(n - 1) + fibonacciDynamic(n - 2)
      maxN = n
    }
    return fibonacciValues(n)
  }

  def noRecursion(n: Int): Int = {
    if (n > maxN) {
      for (i <- maxN + 1 to n) {
        fibonacciValues(i) = fibonacciValues(i-1) + fibonacciValues(i-2)
      }
      maxN = n
    }
    return fibonacciValues(n)
  }

}
