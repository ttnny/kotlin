package designPatterns.chainOfResponsibility.handler

import designPatterns.chainOfResponsibility.driver.CalculateChange

class NickelHandler : IHandler {
    private val nextHandler = PennyHandler()

    override fun handle(change: CalculateChange) {
        // Handle the request
        if (change.cents >= 5) {
            // Add the quarter to the list
            change.coins.add("nickel")
            change.cents -= 5
            println("Nickel handled")
        }
        // If can't handle, send to next handler
        else {
            nextHandler.handle(change)
        }
    }
}