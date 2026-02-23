package oop_00000130143_SHIFFAQALBIANALFARYSI.week03

fun main() {

    val sword = Weapon("Excalibur", 100)

    sword.damage = -50
    sword.damage = 9999

    println("Damage: ${sword.damage}")
    println("Tier: ${sword.tier}")
}