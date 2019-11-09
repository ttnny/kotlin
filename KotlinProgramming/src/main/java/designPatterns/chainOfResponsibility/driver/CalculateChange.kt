package designPatterns.chainOfResponsibility.driver

class CalculateChange(var cents: Int) {
    // List to store the coins
    var coins = mutableListOf<String>()

    // Returns the list of coins
    fun coins(): MutableList<String> {
        return coins;
    }
}