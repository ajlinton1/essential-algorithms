package com.andrewlinton.numerical

import org.scalatest._

class ExercisesSpec extends FlatSpec {

  "Write an algorithm to use a fair six-sided die to generate coin flips." should "succeed" in {
    val randomNumberGenerator = new RandomNumberGenerator(0)
    for (i <- 0 to 100) {
      var result = randomNumberGenerator.getCoinFlip()
      println(result)
    }
  }

  /*
  2. The section “Getting Fairness from Biased Sources” explains how you can use a biased coin to get fair coin flips by
  flipping the coin twice. However, sometimes doing two flips produces no result, so you need to repeat the process.
  Suppose that the coin produces heads three-fourths of the time and tails one-fourth of the time. In that case,
  what is the probability that you'll get no result after two flips and have to try again?

  If the result is {Heads, Tails}, return Heads.
  If the result is {Tails, Heads}, return Tails.

  Determine probability of getting {Heads, Heads} or {Tails, Tails}
  {Heads, Heads} probability: (.75)*(.75) = 0.5625
  {Tails, Tails} probability: (.25)*(.25) = 0.0625

  Answer:
= 0.625
   */

  /*
  3. Again, consider the coin described in Exercise 2. This time, suppose you were wrong and the coin is actually fair
  but you're still using the algorithm to get fair flips from a biased coin. In that case, what is the probability
  that you'll get no result after two flips and have to try again?

  Answer: twoSame: Double = 0.5
   */

  /*
  4. Write an algorithm to use a biased six-sided die to generate fair values between 1 and 6. How efficient is this algorithm?

  Need to find 6 permutations that have equal probability. Throw out any other result
  Probability of a particular value from fair die: 1/6
  Probability of a particular value from biased die: x/6
  Probability of not a particular value from biased die: (6-x)/6

  Answer: Throw die 6 times. If second values through six are different from the first value take first value.
  Otherwise drop answer and throw die again

  Probability of values 2-6 are different from value 1?
     */

  /*
  Chapter 1. 5. Suppose a program takes as inputs N letters and generates all possible unordered pairs of the letters. For example,
  with inputs ABCD, the program generates the combinations AB, AC, AD, BC, BD, and CD. (Here unordered means that AB and
  BA count as the same pair.) What is the algorithm's run time?

  Answer: For each letter put it in the first position
    Second letter: for each letter put it in the second position if it is not already in the first position

      Assume letters are unique
      Create a two dim array
      Set array value to the sum of the x and y axis
      Return values below diagonal

      Run time: n^2
   */
  "Permutations of letters." should "succeed" in {
    val permutations = new Permutations()
    val s = "ABCD"
    permutations.getPermutations(s)
  }
}
