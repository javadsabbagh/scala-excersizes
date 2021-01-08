
//
//import doobie.util.ExecutionContexts
//
//// We need a ContextShift[IO] before we can construct a Transactor[IO]. The passed ExecutionContext
//// is where nonblocking operations will be executed. For testing here we're using a synchronous EC.
//implicit val cs = IO.contextShift(ExecutionContexts.synchronous)
//
//// A transactor that gets connections from java.sql.DriverManager and executes blocking operations
//// on an our synchronous EC. See the chapter on connection handling for more info.
//val xa = Transactor.fromDriverManager[IO](
//  "org.postgresql.Driver", // driver classname
//  "jdbc:postgresql:world", // connect URL (driver-specific)
//  "postgres", // user
//  "", // password
//  Blocker.liftExecutionContext(ExecutionContexts.synchronous) // just for testing
//)
//
//
//package com.kiatack.country
//
//import doobie._, doobie.implicits._
//import cats._, cats.data._, cats.effect._, cats.implicits._
//
//case class Person(name: String, age: Int)
//
//object PersonRepo {
//  val nel = NonEmptyList.of(Person("Bob", 12), Person("Alice", 14))
//
//  val program1 = 42.pure[ConnectionIO]
//  val io = program1.transact(xa)
//  io.unsafeRunSync
//}

package com.kiatack.country

import doobie._, doobie.implicits._, doobie.syntax._
import cats._, cats.data._, cats.effect._, cats.implicits._
import com.kiatack.conn.Connection

object CountryRepo {

  def testQuery = {
    val program2 = sql"select 42".query[Int].unique
    val io2 = program2.transact(Connection.xa)
    io2.unsafeRunSync
  }

  def selectCountry(name: String) = {

  }
}