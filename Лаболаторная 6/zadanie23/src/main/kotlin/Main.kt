fun mergeArrays(vararg arrays: IntArray): IntArray {
    var resultArray = intArrayOf()
    for (array in arrays) {
        resultArray += array
    }
    return resultArray
}

fun main() {
    val arr1 = intArrayOf(1, 2, 3)
    val arr2 = intArrayOf(4, 5, 6)
    val arr3 = intArrayOf(7, 8, 9)

    val mergedArray = mergeArrays(arr1, arr2, arr3)
    println(mergedArray.contentToString()) // Вывод: [1, 2, 3, 4, 5, 6, 7, 8, 9]
}