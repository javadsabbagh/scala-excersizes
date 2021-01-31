
package com.kiatack.practice

sealed trait Test
// case classes take parameters
final case class MM(val code: String) extends Test

sealed trait Nationality
// case object does not take parameters
final case object Iranian extends Nationality {
  val code = 1
}
final case object Foreign extends Nationality {
  val code = 2
}

sealed trait CustomerKind
final case object Real extends CustomerKind {
  val code = 1
}
final case object Legal extends CustomerKind {
  val code = 2
}

object EnumTest {
  val t = MM("Hiii")
  val m: Nationality = Iranian
  val n: CustomerKind =  Real

  (m, n) match {
    case (Iranian, Real) => println(s"Real-Iranian: ${Iranian.code}")
    case (Iranian, Legal) => println("Legal-Iranian")
    case (Foreign, Real) => println("Real-Foreign")
    case (Foreign, Legal) => println("Legal-Foreign")
  }

  def main(args: Array[String]): Unit = {
  }
}