package oop_00000130143_SHIFFAQALBIANALFARYSI.week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("Salary tidak boleh negatif!")
                field = 0
            } else {
                field = value
            }
        }
}