package intro

fun main() {
    val words = arrayOf("a", "", "dog", "jumped", "", "over", "the", "", "fence")
    words.forEach { print("$it, ") }
    println()

    val filteredWords = words.filter { it.isNotEmpty() }
    filteredWords.forEach { print("$it, ") }
    println()
}