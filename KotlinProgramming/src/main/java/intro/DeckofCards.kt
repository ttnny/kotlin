package intro

fun main() {
    val cardSuits = arrayOf("hearts", "clubs", "diamonds", "spades")
    val cardRanks = arrayOf("2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace")
    for (i in 1..5) {
        println(deal(cardSuits, cardRanks))
    }
}

fun deal(cardSuits: Array<String>, cardRanks: Array<String>): String {
    val suit = cardSuits.random()
    val rank = cardRanks.random()

    return "$rank of $suit"
}