package oop_00000130143_SHIFFAQALBIANALFARYSI.week02

class Student(
    val name: String,
    val nim: String,
    val major: String,
    val gpa: Double = 0.0
) {

    init {
        if (nim.length != 5) {
            println("WARNING: NIM tidak valid!")
        }
    }

    constructor(name: String, nim: String)
            : this(name, nim, "Non-Matriculated") {
        println("LOG: Menggunakan constructor jalur umum.")
    }
}
