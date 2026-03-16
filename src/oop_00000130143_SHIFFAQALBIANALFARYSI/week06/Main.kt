package oop_00000130143_SHIFFAQALBIANALFARYSI.week06

fun proccessCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai Checkout: ....")
    method.pay(amount)
}

fun main(){
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = SmartPhone()
    myPhone.turnOn()

    val  pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    proccessCheckout(method = pay1, amount = 50000.0)
    proccessCheckout(method = pay2, amount = 150000.0)
}