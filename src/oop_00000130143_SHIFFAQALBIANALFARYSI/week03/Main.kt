package oop_00000130143_SHIFFAQALBIANALFARYSI.week03

fun main() {

    val e = Employee("Budi")

    e.salary = 5000
    println("Salary: ${e.salary}")

    e.setPerformanceRating(4)

    println("Performance Rating: ${e.getPerformanceRating()}")
}