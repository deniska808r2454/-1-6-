fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)

    for (i in 0 until numbers.size step 5) {
        println(numbers.sliceArray(i until minOf(i + 5, numbers.size)))
    }
}