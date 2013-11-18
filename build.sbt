name := "play-dustjs"

version := "1.5.0"

sbtPlugin := true

organization := "com.jmparsons"

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.2.1")

libraryDependencies += "commons-io" % "commons-io" % "2.2"

libraryDependencies += "org.specs2" %% "specs2" % "1.12.3" % "test"

publishTo := Some(Resolver.url("sbt-plugin-releases", new URL("http://repo.scala-sbt.org/scalasbt/sbt-plugin-releases/"))(Resolver.ivyStylePatterns))

publishMavenStyle := false

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

crossPaths := false

pomExtra := (
  <url>http://github.com/jmparsons/play-dustjs</url>
  <licenses>
    <license>
      <name>Apache 2</name>
      <url>http://www.apache.org/licenses/LICENSE-2.0</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:jmparsons/play-dustjs.git</url>
    <connection>scm:git:git@github.com:jmparsons/play-dustjs.git</connection>
  </scm>
  <developers>
    <developer>
      <id>jmparsons</id>
      <name>Jonathan Parsons</name>
      <url>https://github.com/jmparsons</url>
    </developer>
  </developers>
)
