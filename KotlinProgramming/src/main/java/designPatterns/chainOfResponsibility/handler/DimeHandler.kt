package designPatterns.chainOfResponsibility.handler

import designPatterns.chainOfResponsibility.driver.CalculateChange

class DimeHandler : IHandler {
    private val nextHandler = NickelHandler()

    override fun handle(change: CalculateChange) {
        // Handle the request
        if (change.cents >= 10) {
            // Add the quarter to the list
            change.coins.add("dime")
            change.cents -= 10
            println("Dime handled")
        }
        // If can't handle, send to next handler
        else {
            nextHandler.handle(change)
        }
    }
}