package `01`

fun binarySearch(list: Array<Int>, item: Int): Int {

    var low = 0
    var high = list.lastIndex

    while (low <= high) {

        val mid = (low + high) / 2
        val guess = list[mid]

        when {
            guess == item -> return mid
            guess < item -> low = mid + 1
            else -> high = mid - 1
        }
    }

    return -1
}

fun main(args: Array<String>) {
    val myList = arrayOf(1, 3, 5, 7, 9)
    println(binarySearch(myList, 3))
    println(binarySearch(myList, 4))
}
