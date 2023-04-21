fun factorial(num: Int): Int {

    if (num == 1) {
        num.toLong()
    } else {
        num * factorial(num - 1)
    }
    return num
}


fun main() {
    println(factorial(5))
}

