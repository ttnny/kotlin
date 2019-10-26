package intro

fun main() {
    println("Hello, World!")
    variables()
    println()
    words()
}

fun variables() {
    // read-only variables
    val number = 10
    println(number)

    // read-write variables
    var place = "Seattle"
    place = "Tacoma"
    println(place)
}

fun input() {
    println("Firstname: ")
    val firstName = readLine()
    println("Middle Initial: ")
    val middle = readLine()
    println("Lastname: ")
    val lastName = readLine()

    println("Your name is $firstName $middle. $lastName!")
}

fun words() {
    val adjective = "tall"
    val firstNoun = "carnival"
    val secondNoun = "mountain"
    val verb = "walking"

    println(
        "We went on a $adjective cruise this last Summer and it was a blast!\n" +
                "The boat has a built in theatre with $firstNoun, $secondNoun, and musical entertainment.\n" +
                "I wish we could have spent more time $verb in the ship's pool."
    )
}