package oop_00000130143_SHIFFAQALBIANALFARYSI.week09

fun main() {

    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG",  20,  15.5, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 10,  -5.2, "CLOSED"),
        TradeLog("ETHUSDT", "LONG",  15,   8.3, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT",  5, -12.1, "CLOSED"),
        TradeLog("SOLUSDT", "LONG",  25,  22.0, "CLOSED"),
        TradeLog("SOLUSDT", "SHORT", 10,   3.7, "CLOSED"),
        TradeLog("BTCUSDT", "LONG",  10,   0.0, "OPEN"),
        TradeLog("ETHUSDT", "SHORT",  5,  -2.4, "OPEN")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
    val losingTrades = closedTrades.filter { it.roe <= 0 }

}
