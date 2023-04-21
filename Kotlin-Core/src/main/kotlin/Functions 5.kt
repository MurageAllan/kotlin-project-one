import kotlin.math.pow

sealed class Shapes{
    class Rectangle(var width : Double, var length : Double ) : Shapes()
    class Square( var length: Double) : Shapes()
    class Circle(var radius : Double) : Shapes()
    class Triangle(var base : Double, var height : Double) : Shapes()
}
fun calculateArea(shape : Shapes) : Double{
    var area : Double = 0.00
    when(shape){
        is Shapes.Rectangle -> area = shape.width * shape.length
        is Shapes.Circle -> area = shape.radius * Math.PI
        is Shapes.Triangle -> area = shape.base * shape.height
        is Shapes.Square -> area = shape.length.pow(2)
        else -> {
            println("Not a valid shape")
        }
    }
    return area
}

fun main() {
    println(calculateArea(Shapes.Rectangle(4.98, 7.67)))
}