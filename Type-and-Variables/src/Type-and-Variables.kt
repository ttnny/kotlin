fun main() {
    arrays()
}

fun arrays() {
    var names: Array<String> = arrayOf("John", "Jane", "Jill")
    names[0] = "Jack"
    println(names.toList())

    var ages = intArrayOf(44, 30, 29)
    println(ages.toList())

    val values = Array(5, {2.0})
    println(values.toList())

    var squares = Array(10, {(it*it).toString()})
    println(squares.toList())
}