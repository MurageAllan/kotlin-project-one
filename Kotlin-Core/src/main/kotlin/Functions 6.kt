fun printMansions(vararg houses : String){
    houses.forEach { house -> println(" $house is pretty")}
}

fun main() {
    printMansions(houses = arrayOf("sky ways", "ridge ways", "greenspan"))
}