package designPatterns.adapter.sports.adapters

import designPatterns.adapter.sports.athletes.BaseballAthlete
import designPatterns.adapter.sports.news.IAthlete

class BBAthleteAdapter(private val bbAthlete: BaseballAthlete) : IAthlete {

    override fun getFullName(): String {
        return "${bbAthlete.fName} ${bbAthlete.lName}"
    }

    override fun getStats(): Array<String> {
        // Don't know how many stats...
        val list = mutableListOf<String>()

        for (i in bbAthlete.statNames.indices) {
            val statName = bbAthlete.statNames[i]
            val statValue = bbAthlete.statValues[i]

            // Add a single string stat
            list.add("$statName: $statValue")
        }

        return list.toTypedArray()
    }
}