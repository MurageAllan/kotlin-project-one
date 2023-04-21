var lecturers = ArrayList<String>()
var units = ArrayList<String>(6)
var schools1 = mutableListOf<String>()
var schools2 = ArrayList<String>()
var employee = arrayListOf<String>("John", "Nyamu", "Allan", "James", "Wayne")

fun schoolsDetails(schools : MutableList<String>){
    schools.add("Upper hill")
    schools.add("St Georges")
    schools.add("State house girls")
    schools.add("Moi highschool")

    for(school in schools){
        println(school)
    }
}
fun main() {
    var itr = employee.iterator()
    while(itr.hasNext()){
        println(itr.next())
    }
}