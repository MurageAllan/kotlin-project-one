import java.util.Scanner
import kotlin.math.pow

sealed class Shapess{
    class Rectangle(var length : Double, var width : Double) : Shapess()
    class Triangle(var base : Double, var height : Double) : Shapess()
    class Circle(var radius : Double): Shapess()
    class Square(var width : Double) : Shapess()
}


fun calculateArea(shape : Shapess): Double{
    var area   = 0.0
    when(shape){
        is Shapess.Circle -> area = Math.PI * shape.radius.pow(2)
        is Shapess.Rectangle -> area = shape.length * shape.width
        is Shapess.Square -> area = shape.width.pow(2)
        is Shapess.Triangle -> area = shape.base * shape.height
        else -> println("The shape you entered is invalid")
    }

    return area
}

fun calculateAge(){
    var input : Scanner = Scanner(System.`in`)
    println("Enter the student's year of birth:")
    var yearBorn = input.nextInt()
    println("Enter the current year")
    var currentYear = input.nextInt()
    var age = currentYear - yearBorn
    println("The student's age is $age")

    var elligibleToVote = if(age > 18) "The student is elligible to vote" else "The student cannot vote"
    println(elligibleToVote)

    var elligibleToEmploy = when(age){
        in 1..18 -> println("The student is not qualified for employment")
        else -> println("The student is qualified for employment")
    }
    println(elligibleToEmploy)
}
fun main() {
    println(calculateArea(Shapess.Rectangle(5.9,6.7)))
    calculateAge()
}