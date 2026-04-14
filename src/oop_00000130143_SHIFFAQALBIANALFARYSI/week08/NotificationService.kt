package oop_00000130143_SHIFFAQALBIANALFARYSI.week08

import oop_00000130143_SHIFFAQALBIANALFARYSI.week07.RegularUser

class NotificationService {
    fun senEmail(emailAddress: String) {
        println("Mengirim email ke : $emailAddress")
    }

    fun processUser(user: UserProfile){
        if (user.email != null){
          senEmail(user.email)
        }else {
            println("User ${user.name} tidak memiliki email.")
        }
    }
}