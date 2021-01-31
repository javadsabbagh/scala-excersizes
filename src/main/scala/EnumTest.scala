
package com.kiatack.practice

sealed trait Nationality
final case object Iranian extends Nationality
final case object Foreign extends Nationality

sealed trait CustomerKind
final case object Real extends CustomerKind
final case object Legal extends CustomerKind

object EnumTest {
  val m: Nationality = Iranian
  val n: CustomerKind =  Real

  (m, n) match {
    case (Iranian, Real) => println("Real-Iranian")
    case (Iranian, Legal) => println("Legal-Iranian")
    case (Foreign, Real) => println("Real-Foreign")
    case (Foreign, Legal) => println("Legal-Foreign")
  }

  def main(args: Array[String]): Unit = {
  }
}