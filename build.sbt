name := """play-java-myapp"""
organization := "com.tuyano.play"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.7"

libraryDependencies += guice
