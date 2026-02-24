package oop_00000130143_SHIFFAQALBIANALFARYSI.week04

open class Vehicle(val brand: String) {

    var speed: Int = 0

    open fun accelerate()  {
        speed += 10
        println("$brand membunyikan klakson: $speed km/jam ")
    }

    open fun honk() {
        println("Beep beep!")
    }
}