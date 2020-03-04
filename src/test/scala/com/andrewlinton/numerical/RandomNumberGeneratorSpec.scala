package com.andrewlinton.numerical

import org.scalatest._

class RandomNumberGeneratorSpec extends FlatSpec  {

  "RandomNumberGenerator" should "produce results" in {
    val randomNumberGenerator = new RandomNumberGenerator(0)
    val result = randomNumberGenerator.getRandomNumber()
    println(result)
    assert(result == 5)
    val result1 = randomNumberGenerator.getRandomNumber()
    println(result1)
    assert(result1 == 7)
  }
}
