package oop_00000130143_SHIFFAQALBIANALFARYSI.week10

fun main(){
    // === TEST GENERIC CLASS ===
    println("=== TEST GENERIC CLASS ===")
    val intBox = Box(100)
    val stringBox = Box("Generics in Kotlin")

    println("Isi intBox: ${intBox.value}")
    println("Isi stringBox: ${stringBox.value}")
}