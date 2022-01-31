name := "cats-effect-tutorial"

version := "3.2.9"

scalaVersion := "3.1.1"

libraryDependencies += "org.typelevel" %% "cats-effect" % "3.3.5" withSources() withJavadoc()

scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-unchecked",
  "-language:postfixOps")
