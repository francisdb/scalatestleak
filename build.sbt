name := "scalatestleak"

version := "0.1"

scalaVersion := "2.13.4"

val scalaTestVersion    = "3.2.3"
val akkaVersion         = "2.6.10"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,

  "com.typesafe.akka" %% "akka-testkit" % akkaVersion         % Test,
  "org.scalatest"          %% "scalatest-wordspec"      % scalaTestVersion % Test,
  "org.scalatest"          %% "scalatest-mustmatchers"  % scalaTestVersion % Test,
  "org.scalactic"          %% "scalactic"               % scalaTestVersion % Test
)