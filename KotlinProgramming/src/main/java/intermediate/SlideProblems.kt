package intermediate

fun main() {
    // 1a
    val age = 10

    val message = when {
        age in 1..10 -> "Would you like an apple?"
        age in 11..20 -> "Would you like an orange?"
        age in 21..30 -> "Would you like some grapes?"
        age > 30 -> "Would you like a peach?"
        else -> "This is not a valid age"
    }

    println(message)
    println()

    // 1b
    val headOfKotlin = false
    val output = when (headOfKotlin) {
        true -> "Awesome"
        false -> "Well now you have!"
    }

    println(output)
    println()

    // 2a
    println("Enter a positive number: ")
    val input: String? = readLine()
    val num1: Int? = input?.toInt()

    var sum1 = 0
    for (i in 1..num1!!) {
        sum1 += i
    }

    println(sum1)
    println()

    // 2b
    println("Enter a positive number: ")
    val num2: Int = readLine()!!.toInt()

    var sum2 = 0
    for (i in 1..num2) {
        sum2 += i
    }

    println(num2)
    println()

    // 3
    outputAddress()
    outputAddress(1111, "Broadway", "Seattle", "WA", 98000)
    outputAddress(street = "Teriyaki", city = "Chicken", zipCode = 98111, number = 2222, state = "MA")

    // 4
    val arrayOfWords = arrayOf("a", "", "dog", "jumped", "", "over", "the", "", "fence")
    arrayOfWords.forEach { print("$it, ") }
    println()

    val filteredWords = arrayOfWords.filter { it.isNotEmpty() }
    filteredWords.forEach { print("$it, ") }
    println()

    // 5
    println()
    println("Input a sentence: ")
    val sentence = readLine() ?: ""
    val words = sentence.split(" ")
    val map: MutableMap<Int, Int> = mutableMapOf()

    for (word in words) {
        val length = word.length

        if (!map.containsKey(length)) {
            map[length] = 1
        } else {
            val count = map[length]!! + 1
            map[length] = count
        }
    }

    for (key in map.keys) {
        println("$key -> ${map[key]}")
    }
}

private fun outputAddress(
    number: Int = 1600, street: String = "Amphitheatre Pkwy",
    city: String = "Mountain View", state: String = "CA", zipCode: Int = 94043
) {
    println(
        "$number $street\n" +
                "$city, $state $zipCode"
    )

    println()
}