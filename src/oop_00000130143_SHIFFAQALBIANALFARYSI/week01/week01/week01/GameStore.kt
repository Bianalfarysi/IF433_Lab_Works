package oop_00000130143_SHIFFAQALBIANALFARYSI.week01.week01.week01


fun main() {
    val gameTitle = "Cyber Adventure"
    val price = 650000

    val discount = calculateDiscount(price)
    val finalPrice = price - discount
}

fun calculateDiscount(price: Int) =
    if (price > 500000) price * 20 / 100
    else price * 10 / 100
