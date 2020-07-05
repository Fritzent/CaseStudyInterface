class BinarStudent (val binarCollegeCallback: BinarCollegeCallback){

    private var nameStudent: String = "Andri"
    private var statusStudent: String = "Student"

    fun checkStudent(nama: String, status: String) {
        if(nama ==  nameStudent && status == statusStudent){
            binarCollegeCallback.checkUserBinarStudent(nama, status)
        }else{
            binarCollegeCallback.checkUserBinarMentor(nama, status)
        }
    }
}