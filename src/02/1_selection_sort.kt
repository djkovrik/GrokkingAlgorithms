package `02`

fun smallest(array: IntArray): Int {

    var smallest = array[0]
    var smallestIndex = 0

    for (i in array.indices) {
        if (array[i] < smallest) {
            smallest = array[i]
            smallestIndex = i
        }
    }

    return smallestIndex
}

fun IntArray.remove(element: Int): IntArray =
        this.filter { it != element }.toIntArray()

fun selectionSort(array: IntArray): IntArray {

    var oldArray = array
    val newArray = IntArray(array.size)

    for (i in 0 until newArray.size) {
        val smallestIndex = smallest(oldArray)
        val smallestElement = oldArray[smallestIndex]
        newArray[i] = smallestElement
        oldArray = oldArray.remove(smallestElement)
    }

    return newArray
}

fun printArray(array: IntArray) =
        array.forEach { print("$it ") }

fun main(args: Array<String>) {
    val targetArray = intArrayOf(5, 3, 6, 2, 10, 8, 12, 1, 23)
    printArray(selectionSort(targetArray))
}
