package designPatterns.adapter.sports.test

import designPatterns.adapter.sports.adapters.BBAthleteAdapter
import designPatterns.adapter.sports.athletes.BaseballAthlete
import designPatterns.adapter.sports.news.SportsNews

fun main() {
    //create a few athletes...
    val athlete1 = BaseballAthlete("Ichiro", "Suzuki")
    val athlete2 = BaseballAthlete("Bryce", "Harper")

    //with stats...
    athlete1.addStat("batting-avg", 0.333)
    athlete1.addStat("homeruns", 10)
    athlete2.addStat("stolen bases", 12)

    //report them...
    val news = SportsNews()
    news.trackAthlete(BBAthleteAdapter(athlete1))
    news.trackAthlete(BBAthleteAdapter(athlete2))

    news.printStats()
}