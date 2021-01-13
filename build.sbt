name := "scala-excerizes"
version := "0.1"
scalaVersion := "2.13.4"


// Add zio to dependencies
libraryDependencies ++= Seq(
  "dev.zio" %% "zio" % "1.0.1",
  "dev.zio" %% "zio-interop-cats" % "2.2.0.1"
)

// Add doobie to dependencies
lazy val doobieVersion = "0.10.0"

libraryDependencies ++= Seq(
  "org.tpolecat" %% "doobie-core" % doobieVersion,
  "org.tpolecat" %% "doobie-postgres" % doobieVersion,
  "org.tpolecat" %% "doobie-specs2" % doobieVersion
)

// Add Monix for handling monads
libraryDependencies += "io.monix" %% "monix" % "3.3.0"

// Add Cats library
libraryDependencies ++= Seq(
 "org.typelevel" %% "cats-core" % "2.3.1"
)

// Add Slick library
libraryDependencies ++= Seq(
  "com.typesafe.slick" %% "slick" % "3.3.3",
  "com.h2database" % "h2" % "1.4.200",
  "ch.qos.logback" % "logback-classic" % "1.2.3"
)

scalacOptions ++= Seq(
 "-Xfatal-warnings"
)


mainClass in(Compile, run) := Some("com.kiatack.app.MainApp")
