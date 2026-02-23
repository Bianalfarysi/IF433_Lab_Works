package oop_00000130143_SHIFFAQALBIANALFARYSI.week03

class Employee(val name: String) {

    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("Salary tidak boleh negatif!")
            } else {
                field = value
            }
        }

    private var performanceRating: Int = 0

    fun setPerformanceRating(newRating: Int) {
        if (newRating in 1..5) {
            performanceRating = newRating
        }
    }

    val bonus: Int
        get() = salary / 10
}