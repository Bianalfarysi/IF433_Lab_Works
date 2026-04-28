package oop_00000130143_SHIFFAQALBIANALFARYSI.week10

// LANGKAH 1: Fungsi generik cetak data
fun <T> printData(data: T) {
    println("Data yang diterima: $data")
}

// LANGKAH 2: Fungsi generik dengan tipe kembalian
fun <T> processData(input: T): T {
    return input
}
