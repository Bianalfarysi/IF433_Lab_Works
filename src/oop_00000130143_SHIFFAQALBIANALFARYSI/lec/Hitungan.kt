package oop_00000130143_SHIFFAQALBIANALFARYSI.lec

class Hitungan private constructor(val tipe: String) {
    init {
        println("isi param clas: ${tipe}")
    }
    companion object {
        const val namaMTk: String= "Matematika"
        fun tambah(a: Int, b: Int){
            println("Hasil Penambahan : " + (a+b))
        }
        fun kali(a: Int, b: Int){
            println("Hasil Perkalian : " + (a+b))
        }
        fun buat_data(tipeUser: String) {
            Hitungan(tipeUser)
        }
    }
}