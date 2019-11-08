package designPatterns.adapter.sports.test

import designPatterns.adapter.sports.athletes.BaseballAthlete

fun main() {
    //create a few athletes...
    val athlete1 = BaseballAthlete("Ichiro", "Suzuki")
    val athlete2 = BaseballAthlete("Bryce", "Harper")

    //with stats...
    athlete1.addStat("batting-avg", 0.333)
    athlete1.addStat("homeruns", 10)
    athlete2.addStat("stolen bases", 12)

    //report them...
}