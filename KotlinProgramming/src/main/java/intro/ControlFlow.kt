package intro

import kotlin.math.abs

fun main() {
    ifExpression() // not if statement as in Java
    whenStatement()
    loops()
    println(add(13, 18))
}

fun ifExpression() {
    val a = 10
    val b = 20

    val lowest = if (a < b) "'a'" else "'b'"
    println("Lowest is $lowest")

    val temp = 80
    val isAirConditionerOn = if (temp >= 80) {
        println("It is warm")
        true
    } else {
        println("It is not warm")
        false
    }
    println("Is the air conditioner on: $isAirConditionerOn")
}

fun whenStatement() {
    val burgersOrdered = 1

    when (burgersOrdered) {
        0 -> println("Not hungry")
        1, 2 -> println("Hungry")
        3 -> println("Very hungry")
        else -> {
            println("That much?")
        }
    }

    when (burgersOrdered) {
        // compares abs(x) with x
        abs(burgersOrdered) -> println("Ordered 0 or more burgers")
        else -> {
            println("Ordered less than 0")
        }
    }

    when (burgersOrdered) {
        0 -> println("We need orders")
        in 1..4 -> println("Got some orders")
        in 5..9 -> println("Business is up")
        else -> {
            println("Not sure")
        }
    }

    // 'when' without arguments can be used as 'if-else' in java
    when {
        burgersOrdered <= 0 -> println("None ordered")
        burgersOrdered % 2 == 1 -> println("Odd number ordered")
        burgersOrdered % 2 == 0 -> println("Even number ordered")
    }
}

fun loops() {
    var x = 0

    while (x < 10) {
        println("x = $x")
        x += 3
    }

    do {
        println("x = $x")
        x -= 3
    } while (x > 0)

    for (item in 1..10) {
        print("$item, ")
        // item is val, cannot do item++
    }

    for (char in "biscuit") {
        println(char)
    }

    for ((index, item) in 10.rangeTo(20).step(2).withIndex()) {
        print("${index + 1}: $item, ")
    }
    println();

    val myArray = arrayOf(10, 20, 30, 40, 50)
    for (item in myArray.indices) {
        println("At index $item: ${myArray[item]}")
    }
    println()
}

fun add(first: Int, second: Int): Int {
    return first + second
}