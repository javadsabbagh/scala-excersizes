
package com.kiatack.app

import com.kiatack.country.CountryRepo

object MainApp extends App {
  println("It works!")

  import com.kiatack.country

  CountryRepo.testQuery
}
