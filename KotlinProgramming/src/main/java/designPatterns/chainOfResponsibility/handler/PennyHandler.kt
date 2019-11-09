package designPatterns.chainOfResponsibility.handler

import designPatterns.chainOfResponsibility.driver.CalculateChange

class PennyHandler : IHandler {
    override fun handle(change: CalculateChange) {
        // Handle the request
        if (change.cents >= 1) {
            // Add the quarter to the list
            change.coins.add("penny")
            change.cents -= 1
            println("Penny handled")
        }
        // If can't handle, send to next handler
        else {
            println("Something went wrong")
        }
    }
}