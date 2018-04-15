package `04`

/**
 * Recursive sum function.
 */
fun sum(array: IntArray): Int =
        if (array.size == 1) {
            array[0]
        } else {
            array[0] + sum(array.copyOfRange(1, array.size))
        }

fun main(args: Array<String>) {
    val testArray = intArrayOf(1, 2, 3, 4, 5)
    println("Sum = ${sum(testArray)}")
}