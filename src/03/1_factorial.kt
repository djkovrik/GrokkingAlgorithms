package `03`

fun factorial(x: Int): Int =
        if (x == 1) 1
        else x * factorial(x - 1)

fun main(args: Array<String>) {
    println("Factorial 3 = ${factorial(3)}")
    println("Factorial 5 = ${factorial(5)}")
    println("Factorial 10 = ${factorial(10)}")
}