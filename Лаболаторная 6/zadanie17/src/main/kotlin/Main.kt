fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    val sum = numbers.sum()
    val product = numbers.reduce { acc, i -> acc  i }
    println("Сумма элементов: $sum")
    println("Произведение элементов
