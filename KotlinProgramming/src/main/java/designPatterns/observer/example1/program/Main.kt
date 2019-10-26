package designPatterns.observer.example1.program

import designPatterns.observer.example1.observers.ConsoleObserver
import designPatterns.observer.example1.observers.FileLoggerObserver

fun main() {
    // Create orders and the order system
    val orderSystem = Orders()

    val order1 = Order(1)
    val order2 = Order(2)

    // Attach observers to the process
    val observer = ConsoleObserver()
    orderSystem.addObserver(observer)
    orderSystem.addObserver(FileLoggerObserver())
    order1.addObserver(observer)
    order2.addObserver(observer)

    // Add items to orders
    order1.addLineItem(LineItem("Surfboard", 99.99, 2))
    order1.addLineItem(LineItem("Bowling Ball", 299.99, 1))
    order2.addLineItem(LineItem("Chicken Teriyaki", 11.99, 1))

    // Do something interesting happen...
    orderSystem.placeOrder(order1)
    orderSystem.placeOrders(order1, order2)
}