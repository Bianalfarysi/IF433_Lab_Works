package oop_00000130143_SHIFFAQALBIANALFARYSI.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {

    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }
    if (isJammed) {
        throw DispenserJamException()
    }

    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    println(" Kibble berhasil dikeluarkan! ($requestedGram gr)")
    return availableGram - requestedGram
}

fun main(){
    println("=== Smart Pet Feeder System ===")
    var currentKibbleStock = 50
    println("Stok kibble awal: $currentKibbleStock gr\n")
}

