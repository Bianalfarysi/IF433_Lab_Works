package oop_00000130143_SHIFFAQALBIANALFARYSI.week04

open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {
    fun openTrunk(){
        println("Bagasi Mobil $brand dengan $numberOfDoors pintu dibuka")
    }
}