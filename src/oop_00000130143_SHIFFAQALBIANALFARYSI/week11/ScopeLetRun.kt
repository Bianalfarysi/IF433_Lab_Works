package oop_00000130143_SHIFFAQALBIANALFARYSI.week11

fun main() {
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Alexander"

    // Mengeksekusi blok hanya jika objek tidak null
    val length = name?.let {
        println("Nama terdeteksi: $it") // 'it' merujuk pada name
        it.length // Mengembalikan nilai expression terakhir
    }
    println("Panjang nama: $length")


    println("\n=== TEST RUN FUNCTION ===")
    val result = "Kotlin".run {
        println("Memproses kata: ${this}") // 'this' bisa dihilangkan (implicit)
        this.length * 2
    }
    println("Hasil kalkulasi run: $result")

    println("\n=== TEST WITH ===")
    val user = User("Shiffa", 20)
    with(user) {
        println("User Detail -> Nama: $name, Umur: $age")
    }

}