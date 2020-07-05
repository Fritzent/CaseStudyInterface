import java.util.*

fun main() {
    println("Check Status Binar Student!")

    print("Input your name: ")
    val userNama: String = readLine()!!

    print("It's your already graduation? (Student/Mentor)")
    val statusUser: String = readLine()!!

    val checkStatusUser = BinarCollege()
    checkStatusUser.pasDataToBinarStudent(userNama, statusUser)
}