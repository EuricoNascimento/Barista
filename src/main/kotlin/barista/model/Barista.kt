package barista.model

class Barista: IBarista {

	private val items: MutableList<Coffee> = mutableListOf(
		Coffee("Normal", 50),
		Coffee("Americano", 100)
	)

	override fun getCoffee(orderId: Long, coffeeName: String): Coffee {
		return items.find { coffee -> coffee.name == coffeeName} ?: Coffee("", 0)
	}
}