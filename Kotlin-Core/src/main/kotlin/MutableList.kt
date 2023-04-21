var sportsCars : MutableList<String> = mutableListOf<String>()
var racingCars = mutableListOf<String>()
var offRoadCars : MutableList<String> = mutableListOf()
var generalCars = mutableListOf("Bentley", "Porshe", "Rolls royce")
fun carDetails(cars : MutableList<String>){
    cars.add("Audi")
    cars.add("Mercedes Benz")
    cars.add("BMW")
    cars.add("Toyota")
    cars.add("Nissan")
    for(car in cars){
        println(car)
    }

}

fun main() {
    carDetails(racingCars)
}