fun main() {
    // 2. Максимальное и минимальное значение
    val numbers = intArrayOf(10, 5, 20, 15, 3, 8, 12, 25, 1, 9)
    val max = numbers.maxOrNull()
    val min = numbers.minOrNull()
    println("Максимальное значение: $max")
    println("Минимальное значение: $min")
