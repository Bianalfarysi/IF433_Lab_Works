package oop_00000130143_SHIFFAQALBIANALFARYSI.lec

sealed class Hasil{
    data class Sukses(val data: String) : Hasil()
    data class Error(val ex: Exception) : Hasil()
    object Loading : Hasil()

    fun handle_response(res:Hasil){
        when(res){
            is Sukses -> {
                println("Sukses Lempar Data")
            }
            is Error -> {
                println("Error ${res.ex}")
            }
            Loading -> {
                println("Sedang Loading...")
            }
        }
    }
}