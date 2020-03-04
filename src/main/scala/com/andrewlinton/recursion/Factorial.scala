package com.andrewlinton.recursion

object Factorial {

  def factorial(n: Int): Int = {
    if (n == 0) {
      return 1
    }
    return n * factorial(n - 1)
  }

}
