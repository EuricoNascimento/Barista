package view

import barista.model.Barista
import barista.model.CoffeeType

fun main() {
	val fred = Barista("Fred")
	val sam = Barista("Sam")
	println(fred.acceptOrder(CoffeeType.AMERICANO))
	println(sam.acceptOrder(CoffeeType.NORMAL))
}