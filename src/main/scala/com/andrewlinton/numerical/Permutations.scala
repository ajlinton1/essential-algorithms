package com.andrewlinton.numerical

class Permutations {

  def getPermutations(s: String): Unit = {
    val c = Array.ofDim[String](s.length(),s.length())
    for (i <- 0 until s.length()) {
      for (h <- 0 until s.length()) {
        c(i)(h) = s.charAt(i).toString() + s.charAt(h).toString()
      }
    }

    val c1 = c

    var start = 0;
    for (i <- 0 until s.length()) {
      for (h <- start until s.length()) {
        if (i != h) {
          println(c(i)(h))
        }
      }
      start = start + 1
    }

  }

}
