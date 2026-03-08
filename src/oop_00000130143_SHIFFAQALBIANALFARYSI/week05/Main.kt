package oop_00000130143_SHIFFAQALBIANALFARYSI.week05

fun main() {
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
}