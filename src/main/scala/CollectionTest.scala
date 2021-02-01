
package com.kiatack.practice

import scala.collection.immutable.{TreeSet}
import scala.collection.mutable.ArrayBuffer

object CollectionTest {
   val codes = new ArrayBuffer[Int]()
  codes.addAll(Seq(1, 2, 3, 4))
  codes += 10
  codes ++= Seq(20, 30, 40)
  println(codes)

  //  val TreeSet = TreeSet.from(Seq(1, 2, 3, 4, 5, 6))
  val s = TreeSet.from(Seq(4, 2, 3))
  println(s)

  def main(args: Array[String]): Unit = {
  }
}