package oop_00000130143_SHIFFAQALBIANALFARYSI.week03

fun main() {

    val sword = Weapon("Excalibur", 100)

    val player = Player("Bian")

    player.addXp(50)
    player.addXp(60)

    println("Level sekarang: ${player.level}")
}