addSbtPlugin("org.foundweekends" % "sbt-bintray" % "0.5.1")
addSbtPlugin("com.typesafe.sbt" % "sbt-site" % "1.3.1")
//#sbt-ghpages
addSbtPlugin("com.typesafe.sbt" % "sbt-ghpages" % "0.6.2")
//#sbt-ghpages
addSbtPlugin("io.github.jonas" % "sbt-paradox-material-theme" % "0.3.0")

libraryDependencies += "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value
