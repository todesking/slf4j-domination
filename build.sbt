ThisBuild / scalaVersion := "2.13.8"

lazy val libCL = project in file("lib-cl")
lazy val libLog4j1 = project in file("lib-log4j1")
lazy val libLog4j2 = project in file("lib-log4j2")
lazy val libJUL = project in file("lib-jul")

lazy val root = (project in file("."))
  .dependsOn(libCL)
  .dependsOn(libLog4j1)
  .dependsOn(libLog4j2)
  .dependsOn(libJUL)

val slf4jVersion = "1.7.36"

libraryDependencies += "org.slf4j" % "slf4j-api" % slf4jVersion
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.4.5"

// Override Commons Logging
libraryDependencies += "org.slf4j" % "jcl-over-slf4j" % slf4jVersion
excludeDependencies += ExclusionRule("commons-logging", "commons-logging")

// java.util.logging to slf4j
libraryDependencies += "org.slf4j" % "jul-to-slf4j" % slf4jVersion

// log4j1 to log4j2
libraryDependencies += "org.apache.logging.log4j" % "log4j-1.2-api" % "2.19.0"
excludeDependencies += ExclusionRule("log4j", "log4j")

// log4j2 to slf4j

libraryDependencies += "org.apache.logging.log4j" % "log4j-to-slf4j" % "2.19.0"
