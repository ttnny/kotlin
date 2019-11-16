package designPatterns.prototype.copies

fun main() {
    val registry = VehicleRegistry()

    val truckPrototype = Vehicle(make = "Toyota", model = "Tacoma", mpg = 20, miles = 0, color = "")
    registry.addPrototype("Toyota Tacoma", truckPrototype)

    val carPrototype = Vehicle(make = "Dodge", model = "Caliber", mpg = 32, miles = 0, color = "")
    registry.addPrototype("Dodge Caliber", carPrototype)

    // Create a vehicle with copy constructor
    val firstVehicle = Vehicle(registry.getPrototype("Toyota Tacoma"))
    firstVehicle.setMiles(60000)
    firstVehicle.setColor("Green")
    println("First vehicle: $firstVehicle")

    // Create a second vehicle
    val secondVehicle = Vehicle(registry.getPrototype("Dodge Caliber"))
    secondVehicle.setMiles(166342)
    secondVehicle.setColor("Black")
    println("Second vehicle: $secondVehicle")

    val ttp = registry.getPrototype("Toyota Tacoma")
    val cp = registry.getPrototype("Dodge Caliber")

    println("Truck prototype: $ttp")
    println("car prototype: $cp")
}