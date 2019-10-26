package intro

fun main() {
    method1()
    method2()
}

fun method1() {
    println("Enter a positive number")
    val input: String? = readLine()
    var number: Int? = input?.toInt()

    var sum: Int = 0
    for (i in 1..number!!) {
        sum += i
    }

    println(sum)
}

fun method2() {
    println("Enter a positive number")
    val number: Int = readLine()!!.toInt()

    var sum: Int = 0
    for (i in 1..number) {
        sum += i
    }
    println(sum)
}