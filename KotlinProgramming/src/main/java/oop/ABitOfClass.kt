package oop

class Dog (val name: String, var _weight: Int, val breed: String) {

    val weightInKgs: Double
        get() = _weight / 2.2

    var weight = _weight
        set(value) {
            if (value > 0) field = value
        }

    fun bark() {
        println(if (_weight<20) "Yip!" else "Woof!")
    }

    init {
        println("This is printed first.")
    }
}

fun main() {
    var dog = Dog("Tuna", 19, "Japan")
    println(dog.name)
    println(dog.weight)

    dog.weight = 40
    println(dog.weightInKgs)
}