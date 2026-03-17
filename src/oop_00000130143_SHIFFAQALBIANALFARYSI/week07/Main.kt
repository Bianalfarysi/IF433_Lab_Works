package oop_00000130143_SHIFFAQALBIANALFARYSI.week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n===TEST COMPANION OBJECTS ===")
    val client = NetworkClient.createClient()
}

