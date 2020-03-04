package com.andrewlinton.recursion

import scala.collection.mutable.ArrayBuffer

object RodCutting {

  /*
  Length:	1	2	3	4	5	6	7	8
  Value:	1	5	8	9	10	17	17	20
   */

  val lengthValues = new Array[Int](9)
  lengthValues(1) = 1;
  lengthValues(2) = 5;
  lengthValues(3) = 8;
  lengthValues(4) = 9;
  lengthValues(5) = 10;
  lengthValues(6) = 17;
  lengthValues(7) = 17;
  lengthValues(8) = 20;

  def getLengthValue(length: Int): Int = {
    if (length > 0 && length < 9) {
      return lengthValues(length)
    }
    return 0
  }

  def findOptimalCuts(length: Int): Tuple2[Int, ArrayBuffer[Int]] = {
    var bestCuts = new ArrayBuffer[Int]()
    var bestValue = getLengthValue(length)
    bestCuts.addOne(length)
    for (i <- 1 to length/2) {
      val value1 = findOptimalCuts(i)
      val value2 = findOptimalCuts(length - i)
      if ((value1._1 + value2._1) > bestValue) {
        bestValue = value1._1 + value2._1
        bestCuts = value1._2
        for (j <- 0 until value2._2.length) {
          bestCuts.addOne(value2._2(j))
        }
      }
    }
    return (bestValue, bestCuts)
  }

}
