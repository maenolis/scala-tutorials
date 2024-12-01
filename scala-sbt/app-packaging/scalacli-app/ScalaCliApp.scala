//> using scala 3.4.2
//> using dep com.lihaoyi::os-lib:0.10.7
package com.baeldung.scalacli
import os._

object ScalaCliApp {
  @main def app() = {
    val osName = System.getProperty("os.name")
    val path = os.pwd.toString
    println(s"""
                | Hello from the scala-cli packaged app!
                | Current Path: ${path}
                """.stripMargin)
  }
}

// package this app using scala-cli, use the command `scala-cli package ScalaCliApp.scala -o cliapp --assembly`
// This will generate cliapp and it can be executed as ./cliapp
