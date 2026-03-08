package oop_00000130143_SHIFFAQALBIANALFARYSI.week05

/*fun main() {
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin = Admin(nama = "Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai){
        pegawai.bekerja()

        when (pegawai){
            is Dosen -> {
                println("=>Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin ->  {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("-----------------------")
    }
}*/

fun main() {
    println("=== MATH HELPER - METHOD OVERLOADING ===")
    val math = MathHelper()

    val luasPersegi = math.hitungLuas(5)
    println("Luas Persegi (sisi = 5)           : $luasPersegi")

    val luasPersegiPanjang = math.hitungLuas(4, 6)
    println("Luas Persegi Panjang (p=4, l=6)   : $luasPersegiPanjang")

    val luasLingkaran = math.hitungLuas(7.0)
    println("Luas Lingkaran (r = 7.0)          : $luasLingkaran")
}