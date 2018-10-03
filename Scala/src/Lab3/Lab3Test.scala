package Lab3

import org.scalatest.FunSuite

class Lab3Test extends FunSuite {

  test("testSqrt") {
    assert(Lab3.sqrt(0) == 0)
    1 to 100 foreach(i => assert(Lab3.sqrt(i * i) == i))
    // Operations with numbers below 1 require higher precision
    val PRECISION = Lab3.DEFAULT_PRECISION / 100
    1 to 100 map(_ / 100.0) foreach (i => assert(Lab3.sqrt(i*i, PRECISION) - i < Lab3.DEFAULT_PRECISION))
    assert(Lab3.sqrt(Math.PI) - Math.sqrt(Math.PI) < Lab3.DEFAULT_PRECISION)
    assert(Lab3.sqrt(Math.E) - Math.sqrt(Math.E) < Lab3.DEFAULT_PRECISION)
  }

}
