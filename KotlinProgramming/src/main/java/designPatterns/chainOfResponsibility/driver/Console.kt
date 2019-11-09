package designPatterns.chainOfResponsibility.driver

import designPatterns.chainOfResponsibility.handler.QuarterHandler

fun main() {
    // Create a request to the first handler
    val handler = QuarterHandler()

    // Instantiate a list of coins with the amount of change we want back
    val change = CalculateChange(74)

    // Handle the request
    while (change.cents != 0) {
        handler.handle(change)
        println(change.cents)
    }

    // Display the coins
    for (coin in change.coins) {
        println(coin)
    }
}