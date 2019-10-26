package intro

fun main() {
    val nothing = printMe("Hello")
    println(nothing)

    if(nothing != Unit) {
        // when a function returns nothing, it has Unit type
    }

    println(getPI())
    println(min(10, 91))

    val descriptor = describeNum(100.0)
    println(descriptor)

    personnel(num = 80, street = "Chicken", city = "Teriyaki", state = "CT", zip = 80000)
}

fun printMe(message: String) {
    println(message)
}

// Single expression function
fun getPI(): Double = 3.14159265359
fun min(valueOne: Int, valueTwo: Int) = if(valueOne < valueTwo) valueOne else valueTwo
fun describeNum(num: Double) = when {
    num > 0 -> "positive"
    num < 0 -> "negative"
    else -> "0"
}

// Practice
fun personnel(num: Int = 1600, street: String = "Amphitheatre Parkway",
              city: String = "Mountain View", state: String = "CA", zip: Int = 94043) {
    println("Your location is: $num  $street, $city, $state, $zip.")
}