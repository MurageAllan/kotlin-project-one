class CalculateArea<T>(var length: T, var height: T, var radius: T, var width: T) {
}

fun <T> printList(listOfCourses: ArrayList<T>) {
    var itr = listOfCourses.iterator()
    while (itr.hasNext()) {
        println(itr.next())
    }


}

fun <T> ArrayList<T>.printValue(){
    for(element in this){
        println(element)
    }
}

fun main() {
    var values = arrayListOf<String>("Nyamu", "Allan", "Donald", "Stacy", "Wangeci", "Ivy")
    println(arrayListOf("Mathematics", "Phyiscs", "Biology", "Chemistry"))
    println(arrayListOf(8, 2, 3, 7, 9, 10))
    values.printValue()

}