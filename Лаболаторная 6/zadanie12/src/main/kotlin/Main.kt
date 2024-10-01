fun main() {
val numbers = intArrayOf(1, 2, 3, 4, 5)
val index1 = 0
val index2 = 4
val temp = numbers[index1]
numbers[index1] = numbers[index2]
numbers[index2] = temp
println("Массив после перестановки: ${numbers.joinToString(", ")}")
}