package oop_00000130143_SHIFFAQALBIANALFARYSI.week08

fun main() {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)
    val destination = emptyOrder.deliveryDetail?.Address?.city?.name ?: "Kota Tidak Deketahui"
    println("Tujuan Pengriman $destination")
}