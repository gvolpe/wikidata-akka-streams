name := "wikidata-akka-streams"

scalaVersion := "2.11.7"

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

libraryDependencies ++= Seq(
  "com.github.scopt" %% "scopt" % "3.3.0",
  "org.json4s" %% "json4s-jackson" % "3.2.11",
  "com.typesafe.akka" %% "akka-stream-experimental" % "1.0-RC4"
)

scalacOptions in Test ++= Seq("-Yrangepos")

mainClass in Compile := Some("com.intenthq.wikidata.App")