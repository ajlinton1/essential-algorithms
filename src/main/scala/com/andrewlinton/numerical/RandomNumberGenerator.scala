package com.andrewlinton.numerical

import Math._

class RandomNumberGenerator(seed: Int) {
  val a = 7
  val b = 5
  val m = 11
  var x = seed

  def getRandomNumber(): Int = {
    x =  Math.floorMod((a * x + b), m)
    return x
  }

  def getDiceValue(): Int = {
    val r: Float = getRandomNumber()
    val x: Float = (r / (m -1))
    val y: Float = x * (6 -1)
    val ret = Math.round(y) + 1
    return ret
  }

  def getCoinFlip(): String = {
    val d = getDiceValue()
    if (d > 3) {
      return "heads"
    } else {
      return "tails"
    }
  }
}