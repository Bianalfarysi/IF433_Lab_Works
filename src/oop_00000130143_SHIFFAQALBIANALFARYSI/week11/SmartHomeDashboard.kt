package oop_00000130143_SHIFFAQALBIANALFARYSI.week11

fun main(){
    println("=== SMART HOME CONFIGURATION PIPELINE ===")
    val homeDevices = mutableListOf<SmartDevice>()

    println("\n[SETUP] Mengonfigurasi perangkat pencahayaan...")
    SmartDevice("Philips WiZ Living Room", "Lighting").apply {
        isOnline = true
        powerLoad = 12
    }.also {
        println("(LOG) Lampu pintar berhasil dikonfigurasi: ${it.name}")
        homeDevices.add(it)
    }

    println("\n[SETUP] Mengonfigurasi perangkat keamanan...")
    SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }

}