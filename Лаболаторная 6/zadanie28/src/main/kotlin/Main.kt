fun main() {
    println("Введите размер массива:")
    val size = readLine()!!.toInt()
    println("Введите элементы массива через пробел:")
    val numbers = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    println("Массив: ${numbers.joinToString(", ")}")
}