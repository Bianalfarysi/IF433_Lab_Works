package oop_00000130143_SHIFFAQALBIANALFARYSI.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing ElectricCar ---")
    val myEv = ElectricCar(brand = "Tesla", numberOfDoors = 4, batteryCapacity = 85)
    myEv.accelerate()
    myEv.honk()
    myEv.openTrunk()
}