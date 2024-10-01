fun main() {
val numbers = IntArray(20) { Random.nextInt(1, 101) }
println("Массив случайных чисел: ${numbers.joinToString(", ")}")
}
