package barista.model

class Barista(val name: String) {
	fun acceptOrder(type: CoffeeType): Coffee {
		return Coffee(type)
	}
}