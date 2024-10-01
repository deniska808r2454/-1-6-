fun main() {
val numbers = intArrayOf(1, 2, 3, 4, 5)
val copy = numbers.copyOf()
println("Копия массива: ${copy.joinToString(", ")}")
}