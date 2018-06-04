organization := "org.http4s"
name := "jawn-fs2"

scalaVersion := "2.12.5"
crossScalaVersions := Seq("2.11.12", scalaVersion.value)

version := s"0.13.0-M1"

val JawnVersion   = "0.12.1"
val Fs2Version    = "1.0.0-M1"
val Specs2Version = "4.1.0"

libraryDependencies ++= Seq(
  "org.spire-math" %% "jawn-parser" % JawnVersion,
  "co.fs2"         %% "fs2-core"    % Fs2Version,
  "org.spire-math" %% "jawn-ast"    % JawnVersion   % "test",
  "co.fs2"         %% "fs2-io"      % Fs2Version    % "test",
  "org.specs2"     %% "specs2-core" % Specs2Version % "test",
)

publishTo := Some(
  if (isSnapshot.value)
    Opts.resolver.sonatypeSnapshots
  else
    Opts.resolver.sonatypeStaging
)
