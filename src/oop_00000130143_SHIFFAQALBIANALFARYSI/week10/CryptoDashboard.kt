package oop_00000130143_SHIFFAQALBIANALFARYSI.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.85))
    coinRepo.add(Coin("ETH", 12.5))
    coinRepo.add(Coin("USDT", 500.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("=== CRYPTO WALLET DASHBOARD ===")
    println("Status: ${response.status}")
    println("-------------------------------")
    response.data.forEach { coin ->
        println("Koin : ${coin.name}")
        println("Saldo: ${coin.balance}")
        println("-------------------------------")
    }
}