fun findSecondMax(arr: IntArray): Int? {
    if (arr.size < 2) {
        return null
    }

    var max = arr[0]
    var secondMax = arr[1]

    for (i in 2 until arr.size) {
        if (arr[i] > max) {
            secondMax = max
            max = arr[i]
        } else if (arr[i] > secondMax && arr[i] != max) {
            secondMax = arr[i]
        }
    }

    return secondMax
}

fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5, 4, 6)
    val secondMax = findSecondMax(arr)
    println(secondMax) // Вывод: 5
}