
package com.kiatack.conn

import doobie.Transactor
import cats.effect.IO, cats.effect.Blocker

object Connection {
  import doobie.util.ExecutionContexts

  // We need a ContextShift[IO] before we can construct a Transactor[IO]. The passed ExecutionContext
  // is where nonblocking operations will be executed. For testing here we're using a synchronous EC.
  implicit val cs = IO.contextShift(ExecutionContexts.synchronous)

  // A transactor that gets connections from java.sql.DriverManager and executes blocking operations
  // on an our synchronous EC. See the chapter on connection handling for more info.
  val xa = Transactor.fromDriverManager[IO](
    "org.postgresql.Driver",
    "jdbc:postgresql://148.251.100.3:5432/world-db",
    "world",
    "world123",
    Blocker.liftExecutionContext(ExecutionContexts.synchronous) // just for testing
  )
}
