package com.wellfactored.slickgen

import com.wellfactored.propertyinfo.PropertyInfoGen

trait ModuleDefinition extends PropertyInfoGen {
  def spec: ModuleSpec

  def main(args: Array[String]): Unit = {
    spec.generate.foreach(println)
  }

}
