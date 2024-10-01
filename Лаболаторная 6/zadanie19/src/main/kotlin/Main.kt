
fun mergeSortedArrays(arr1: IntArray, arr2: IntArray): IntArray {
    val mergedArray = IntArray(arr1.size + arr2.size)
    var i = 0
    var j = 0
    var k = 0

    while (i < arr1.size && j < arr2.size) {
        if (arr1[i] < arr2[j]) {
            mergedArray[k] = arr1[i]
            i++
        } else {
            mergedArray[k] = arr2[j]
            j++
        }
        k++
    }

    while (i < arr1.size) {
        mergedArray[k] = arr1[i]
        i++
        k++
    }

    while (j < arr2.size) {
        mergedArray[k] = arr2[j]
        j++
        k++
    }

    return mergedArray
}

fun main() {
    val arr1 = intArrayOf(1, 3, 5, 7, 9)
    val arr2 = intArrayOf(2, 4, 6, 8, 10)

    val mergedArray = mergeSortedArrays(arr1, arr2)
    println(mergedArray.contentToString()) // Вывод: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
}