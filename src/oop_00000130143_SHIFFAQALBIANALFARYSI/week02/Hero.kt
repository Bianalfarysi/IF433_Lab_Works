package oop_00000130143_SHIFFAQALBIANALFARYSI.week02

class Hero(
    val name: String,
    var baseDamage: Int,
    var hp: Int = 100   // Default HP = 100
) {

    fun attack(targetName: String) {
        println("$name menebas $targetName!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage

        // HP tidak boleh minus
        if (hp < 0) {
            hp = 0
        }
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}
