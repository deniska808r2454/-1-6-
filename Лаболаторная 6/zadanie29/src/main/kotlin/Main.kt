fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    numbers.sort()
    val median = if (numbers.size % 2 == 0) {
        (numbers[numbers.size / 2 - 1] + numbers[numbers.size / 2]) / 2.0
    } else {
        numbers[numbers.size / 2].toDouble()
    }
    println("Медиана: $median")
}