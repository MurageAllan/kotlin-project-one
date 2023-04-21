var scientificBooks : List<String> = listOf("end of life", "origins of the earth", "the solar system", "life in the next world", "charles darwin books  ")
var mappedScientificBooks : Map<Int, String> = mapOf(29 to "end of life", 29 to "origins of the earth", 30 to "the solar system", 40 to "life in the next world")
fun perfomingComputations(){
    var filteredBooks = scientificBooks.filter { it -> it.length > 12 } // Returns only the element satisfying the given predicate
    var partionedBooks = scientificBooks.partition { it -> it.length > 12 } // Returns both the elemnets satisfying the predicate and those not satisfying the predicate
    var groupedBooks = scientificBooks.groupBy { it -> it.length > 12 } // Groups the elements into several groups satisfying the predicate
    var associateByBooks = scientificBooks.associateBy { it -> it.length > 15 } // groups elements but removes duplicate elements
    var mappedBooks = scientificBooks.map { it -> it.uppercase() }
    var anyBooks = scientificBooks.any { it -> it.length == 11 } // true
    var allBooks = scientificBooks.all { it -> it.endsWith("earth") } // false
    var noneOfTheBooks = scientificBooks.none{it -> it.contains("e")} // false
    var findBook = scientificBooks.find { it -> it.contains("earth") }!!
    var firstBook = scientificBooks.first { it -> it.length == 11 }
    var firstOrNullBook = scientificBooks.firstOrNull { it -> it.length == 12 }
    var countedBooks = scientificBooks.count { it -> it.length > 11 }
    var transformedListMap = scientificBooks.associateWith { it -> it.uppercase() }
    var zippedBooks = scientificBooks.zipWithNext { a, b -> "$a : $b" }
    // var flattenBooks = scientificBooks.flatMap {  }
    println(filteredBooks)
    println(partionedBooks)
    println(groupedBooks)
    println(associateByBooks)
    println(mappedBooks)
    println(anyBooks)
    println(noneOfTheBooks)
    println(allBooks)
    println(findBook)
    println(firstBook)
    println(firstOrNullBook)
    println(countedBooks)
    println(transformedListMap)
    println(zippedBooks)
    println("\n")
    scientificBooks.forEach{ println(it) }
    println("\n")
    scientificBooks.forEachIndexed { _, value -> println(value)  } // index which is a required arg is unused hence replaced with "_"

}

fun main() {
    perfomingComputations()
    println("\n")
    try {
        println(scientificBooks.firstOrNull { it.length == 11 }?.substring(0, 4)?: "No such element found")
    }catch (e : Exception){
        println(e.message)
    }
}