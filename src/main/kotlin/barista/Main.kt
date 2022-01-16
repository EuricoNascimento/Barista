package barista

import barista.model.Barista

fun main() {
	val fredOrder = Barista()
	val samOrder = Barista()

	val coffeeFred = fredOrder.getCoffee(1, "Americano")
	val coffeeSam = samOrder.getCoffee(2, "Normal")

	println(coffeeFred.name == "Americano")
	println(coffeeSam.name == "Normal")
}