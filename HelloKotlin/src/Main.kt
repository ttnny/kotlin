fun main(args: Array<String>) {
    println("Hello, Kotlin")

    var_declarations()
    ranges()
}

fun ranges() {
    val a: IntRange = 1..10 // 1,2,3,...,10
    val b = 1.rangeTo(10)
    for (x in a) print(x)
    println()
    for (x in b) print(x)
    println()

    var c = 10.downTo(1)
    for (x in c) print(x)
    println()

    val d = 100 downTo 1 step 3
    for (x in d) print(x)
    println()
}

fun var_declarations() {
    // cannot reassign using val
    val a: Int = 64
    val b: Long = 1234
    val c: Float = 2.3f // needs the f
    val d: Double = 2.3e3
    println("$a $b $c $d")

    val f: StringBuffer = StringBuffer("test")
    f.replace(0, 1, "T") // this ok
    // f = StringBuffer("abcd") // this is not ok

    // can reassign using var
    var g: Int = 123

}