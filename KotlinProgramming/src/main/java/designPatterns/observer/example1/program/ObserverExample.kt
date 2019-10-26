package designPatterns.observer.example1.program

import designPatterns.observer.example1.components.Observable

data class LineItem(
    val type: String,
    val value: Double,
    val quantity: Int
)

data class Order(val id: Long) : Observable() {
    private val items = mutableListOf<LineItem>()

    fun addLineItem(item: LineItem) {
        items.add(item)

        notifyObservers(arrayOf("${item.type} added to order $id"))
    }
}

class Orders : Observable() {
    val orders = mutableSetOf<Order>()

    fun placeOrders(vararg newOrder: Order) {

    }

    fun placeOrder(newOrder: Order) {
        if (!orders.any { it.id == newOrder.id }) {
            orders.add(newOrder)
            notifyObservers(arrayOf("Order created: ${newOrder.id}"))
        }
    }
}