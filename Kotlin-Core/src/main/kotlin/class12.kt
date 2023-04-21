private class Student{
    var name: String? = "Owino"
    var age: Int? = null
    var course: String? = null

    class ForeignStudent{
        var race: String? = "Chinese"
        var countryOfOrigin : String? = "China"


    }

    inner class NativeStudent{
        var tribe: String = "Luo"
        var language = "dholuo"
        var name = "Otieno"
        fun info(): String {
            return "The student's name is $name"
        }
    }
    fun perfomance(){
        println("The student perfomed well")
    }

    fun locomotion (){
        println("The student moves by legs")
    }

    fun description(name: String = "Nyamu", age: Int = 21, course: String = "Bsc.Mathematics and computer Science"){

        this.name = name
        this.age = age
        this.course = course

        println("The students name is $name and age is $age and is taking $course")
    }
}

fun main() {
    var student = Student()
    // creating a nested class obj
    var foreignStudent = Student.ForeignStudent()
    // creating an inner class obj
    var nativeStudent = Student().NativeStudent()


    student.age = 21
    Student().name = "Nyamu"
    Student().course = "Bsc.Maths and Computer Science"

    println(student.age)
    Student().perfomance()
    Student().locomotion()
    Student().description("Murage", 22, "Bsc.Physics")

    println(Student.ForeignStudent().countryOfOrigin)
    println(foreignStudent.race)
    

    println(Student().NativeStudent().tribe)
    println(nativeStudent.language)
    println(nativeStudent.info())


}