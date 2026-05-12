package oop_00000130143_SHIFFAQALBIANALFARYSI.week12

class InsufficientFundsException(
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount, balance: $balance")