open class BinarCollege: BinarCollegeCallback{
    val binarStudent = BinarStudent(this)

    fun pasDataToBinarStudent(nama: String, status: String) {
        binarStudent.checkStudent(nama, status)
    }

    override fun checkUserBinarStudent(nama: String, status: String) {
        println(" Orang dengan nama $nama masuk dalam golongan $status di Binar Academy")
    }

    override fun checkUserBinarMentor(nama: String, status: String) {
        println(" Orang dengan nama $nama masuk dalam golongan $status di Binar Academy")
    }
}