package designPatterns.chainOfResponsibility.handler

import designPatterns.chainOfResponsibility.driver.CalculateChange

class QuarterHandler : IHandler {
    private val nextHandler = DimeHandler()

    override fun handle(change: CalculateChange) {
        // Handle the request
        if (change.cents >= 25) {
            // Add the quarter to the list
            change.coins.add("quarter")
            change.cents -= 25
            println("Quarter handled")
        }
        // If can't handle, send to next handler
        else {
            nextHandler.handle(change)
        }
    }
}