fun main() {
val numbers = intArrayOf(1, 2, 3, 2, 4, 5, 3, 6, 7, 8, 9, 10, 1)
val uniqueNumbers = numbers.distinct().toTypedArray()
println("Уникальные элементы: ${uniqueNumbers.joinToString(", ")}")
}