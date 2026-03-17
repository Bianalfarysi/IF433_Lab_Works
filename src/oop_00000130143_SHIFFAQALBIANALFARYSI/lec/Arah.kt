package oop_00000130143_SHIFFAQALBIANALFARYSI.lec

enum class Arah(val Petunjuk: String){
    Atas(Petunjuk = "Naik"),
    Bawah(Petunjuk = "Turun"),
    Kiri(Petunjuk = "Belok"),
    Kanan(Petunjuk = "Mengsong");

    fun tampilkan_isi_param(){
        println("arah ke $Petunjuk")
    }
}