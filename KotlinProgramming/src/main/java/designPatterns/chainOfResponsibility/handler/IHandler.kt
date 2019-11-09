package designPatterns.chainOfResponsibility.handler

import designPatterns.chainOfResponsibility.driver.CalculateChange

interface IHandler {
    fun handle(change: CalculateChange)
}