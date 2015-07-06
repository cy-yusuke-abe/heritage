name := "heritage"

version := "1.0"

scalaVersion := "2.11.7"

resolvers += "BaseX" at "http://files.basex.org/maven"

libraryDependencies ++= Seq(
  "com.typesafe" % "config" % "1.3.0",
  "javax.servlet" % "javax.servlet-api" % "3.1.0",
  "org.basex" % "basex" % "8.1"
)