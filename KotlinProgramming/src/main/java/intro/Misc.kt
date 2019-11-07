package intro

fun main() {
    for (i in 1..4) {
        print(randomChar)
    }

    val list = listOf<Int>(12, 13, 15)
    val map: Map<String, Int> = mapOf("green" to 8, "blue" to 3)

    val book = Book()
    println(book.title)
    book.title = "IT"
}

val listA = mutableListOf(12, 8)
listA.