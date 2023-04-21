sealed class Shape{

    class Rectangle(var length: Float = 5.65F, var width: Float = 4.87F): Shape(){

    }

    class Triangle(var height: Float = 6.56F, var width: Float = 7.93F): Shape(){

    }

    class Circle(var radius: Float = 5.98F): Shape(){
        
    }
}

fun evaluate(shape : Shape){
    when(shape){
        is Shape.Circle -> println("Area of a circle is ${3.14 * shape.radius * shape.radius}")
        is Shape.Triangle -> println("Area of the triangle is ${(shape.width * shape.height) / 2}")
        is Shape.Rectangle -> println("Area of a rectangle is ${shape.length * shape.width}")
    }
}

fun main() {
    evaluate(Shape.Rectangle())
    evaluate(Shape.Triangle())
    evaluate(Shape.Circle())
}