package oop_00000130143_SHIFFAQALBIANALFARYSI.lec

class KRS(override val nama: String, override val nameSiswa: String) : Mahasiswa, Siswa {
    override fun belajar(){
        println("si $nama sedang belajar")
        println("Siswa $nameSiswa sedang belajar")
    }

    override  fun main_game() {
        super<Mahasiswa>.main_game()
    }

    override fun makan(){
        println("Mahasiswa makan")
    }

    override fun mandi() {
        println("Mahasiswa mandi")
    }
}