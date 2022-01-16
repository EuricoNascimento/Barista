package barista.model

interface IBarista {
    fun getCoffee(orderId: Long, coffeeName: String): Coffee
}