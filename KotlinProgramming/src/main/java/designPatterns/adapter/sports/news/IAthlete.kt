package designPatterns.adapter.sports.news

interface IAthlete {
    fun getFullName(): String
    fun getStats(): Array<String>
}