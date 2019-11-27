package designPatterns.factory.factoryMethodPattern.advertisements

interface IRegionalAdGenerator {
    fun getAppropriateAds(): List<Advertisement>
}