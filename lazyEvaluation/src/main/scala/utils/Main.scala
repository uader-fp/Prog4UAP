package utils


object Main extends App {

  def and(a: Boolean, b : => Boolean) : Boolean = if (a) b else false
  def or(a: Boolean, b : => Boolean) : Boolean = if (a) true else b

  ///and({ println("se evalua a "); false}, { println("se evalua b "); false})
  or({ println("se evalua a "); true}, { println("se evalua b "); false})

}
