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

mainClass in(Compile, run) := Some("com.kiatack.app.MainApp")
