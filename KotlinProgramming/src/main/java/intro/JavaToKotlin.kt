package intro

fun main() {
    whenStatement1()
    ifTernary()
}

fun whenStatement1() {
    val age = 10
    val message = when {
        age in 0..10 -> "Would you like an apple?"
        age in 11..20 -> "Would you like an orange?"
        age in 21..31 -> "Would you like some grapes?"
        age > 30 -> "Would you like a peach?"
        else -> "This is not a valid age."
    }

    println(message)
}

fun ifTernary() {
    val heardOfKotlin = false;
    if (heardOfKotlin) print("Awesome!") else print("Well now you have!")
}
