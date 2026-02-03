package oop_00000130143_SHIFFAQALBIANALFARYSI.week01.week01.week01


fun main() {
    val gameTitle = "Cyber Adventure"
    val price = 650000

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    val userNote: String? = null

    printReceipt(
        title = gameTitle,
        originalPrice = price,
        finalPrice = finalPrice,
        note = userNote
    )
}

fun calculateDiscount(price: Int) =
    if (price > 500000) price * 20 / 100
    else price * 10 / 100

fun printReceipt(
    title: String,
    originalPrice: Int,
    finalPrice: Int,
    note: String?
) {
    println("===== SteamKW Receipt =====")
    println("Game Title      : $title")
    println("Original Price  : Rp $originalPrice")
    println("Final Price     : Rp $finalPrice")
    println("Note            : ${note ?: "Tidak ada catatan"}")
    println("===========================")
}
