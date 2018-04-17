package `04`

fun size(array: IntArray): Int =
    if (array.isEmpty()) {
        0
    } else {
        1 + size(array.copyOfRange(1, array.size))
    }

fun main(args: Array<String>) {
    val testArray = intArrayOf(1, 2, 3, 4, 5)
    println("Size = ${size(testArray)}")
}