package oop

class GymMembership (val firstName: String, val lastName : String, val accountType: String) {
    private val types = arrayOf("premier", "standard", "limited")

    init {
        require(types.contains(accountType))
    }

    fun printBadge() {
        println("----------Badge----------")
        println("Name: $firstName $lastName")
        println("Account Type: $accountType")
        println("-------------------------")
    }

    override fun toString(): String {
        return ("Membership for $firstName $lastName")
    }
}

fun main() {
    val member = GymMembership("Tony", "Ng.", "standard")

    member.printBadge()
    println(member.toString())
}