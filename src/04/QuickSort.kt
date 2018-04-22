package `04`

fun quickSort(list: List<Int>): List<Int> {
    if (list.count() < 1) {
        return list
    }
    val pivot = list[list.count() / 2]

    val equal = list.filter { it == pivot }
    val less = list.filter { it < pivot }
    val greater = list.filter { it > pivot }

    return quickSort(less) + equal + quickSort(greater)
}

fun main(args: Array<String>) {
    val testList = intArrayOf(1, 8, 6, 0, 5, 4, 7, 3).toList()
    println("Sorted list = ${quickSort(testList)}")
}