val cars = Array<String>(9) { "Mercedes Benz" } // An array of with string values only of size nine and default value "Mercedes benz"
val bikes = Array<String>(7) { "Ducatti" }
val phones = Array<String>(8) { "Iphone" }
val children = Array<Int>(4) { 9 }

fun addCars(values: Array<String>) {
    values.set(0, "Audi")
    values.set(1, "BMW")
    values.set(5, "Mistubishi")
    values[2] = "Subaru"
    values[3] = "Toyota"
    values[4] = "Nissan"

    for(element in values){
        println(values)
    }
}

fun main() {
    addCars(cars)
}