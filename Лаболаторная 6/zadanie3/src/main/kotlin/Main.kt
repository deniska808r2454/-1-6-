fun main() {
val numbers = intArrayOf(5, 1, 8, 2, 9, 3, 7, 4, 6, 10)
val max = numbers.maxOrNull() ?: 0
val min = numbers.minOrNull() ?: 0
println("Максимальное значение: $max")
println("Минимальное значение: $min")
}