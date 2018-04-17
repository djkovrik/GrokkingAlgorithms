package `04`

/**
 * Recursive function to count find max element in the list.
 */
fun maxElement(array: IntArray, firstIndex: Int, lastIndex: Int): Int {
    val max: Int
    return if (firstIndex == lastIndex) {
        array[firstIndex]
    } else {
        max = maxElement(array, firstIndex + 1, lastIndex)

        if (array[firstIndex] >= max) {
            array[firstIndex]
        } else {
            max
        }
    }
}

fun main(args: Array<String>) {
    val testArray = intArrayOf(1, 2, 3, 4, 5, 4, 3, 2)
    println("Max element = ${maxElement(testArray, 0, testArray.lastIndex)}")
}