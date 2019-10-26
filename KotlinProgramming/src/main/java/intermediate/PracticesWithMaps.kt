package intermediate

fun main() {
    // Mutable map
    val mapOfColors = mutableMapOf(
        "red" to 1,
        "blue" to 2,
        "yellow" to 3
    )

    // Loop over key/value pairs
    for (key in mapOfColors.keys) {
        // Print out the color and ranking
        println("Color $key is ranked ${mapOfColors[key]}")
    }

    // What can we do or not do?
    mapOfColors["green"] = 4
    mapOfColors["pink"] = 5

    if (mapOfColors.containsKey("pink")) {
        println("Pink is in the map")
    }
}