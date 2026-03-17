package oop_00000130143_SHIFFAQALBIANALFARYSI.lec

import oop_00000130143_SHIFFAQALBIANALFARYSI.lec.Hitungan
import oop_00000130143_SHIFFAQALBIANALFARYSI.lec.SaveData

fun main () {
    println("link ${koneksi.kon}")
    koneksi.coba_konek_db()

    Hitungan.Companion.tambah(a = 10, b = 20)
    Hitungan.Companion.kali(a = 20, b = 20)
    println("NAMA MATKUL: ${Hitungan.Companion.namaMTk}")

    Hitungan.Companion.buat_data(tipeUser = "User biasa")

    val dt = SaveData("Mario", 2, 3, currentLevel = 5)
    println("Nama char ${dt.namaChar}")
    println(dt)

    val dtCopy = dt.copy(namaChar = "Luigi")
    println("Nama char ${dtCopy.namaChar}")
    println(dtCopy)

    println("=== Class Enum ===")
    val arh = Arah.Atas
    println(arh.tampilkan_isi_param())

    println("--- SEALED Class ---")
    val hsl : Hasil = Hasil.Sukses("Berhasil Simpan")
    hsl.handle_response(hsl)

}