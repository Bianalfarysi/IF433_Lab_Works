package oop_00000130143_SHIFFAQALBIANALFARYSI.week10

// Generic wrapper untuk simulasi response dari API/jaringan
data class ApiResponse<T>(val status: String, val data: T)