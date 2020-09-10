package com.andrewlinton.recursion

object Factorial {

  def factorial(n: Int): Int = {
    if (n == 0) {
      return 1
    }
    return n * factorial(n - 1)
  }

  def noRecursive(n: Int): Int = {
    var result = 1
    var n1 = n
    while (n1 !=0) {
      result = result * n;
      n1 = n1 - 1
    }
    return result
  }

}

