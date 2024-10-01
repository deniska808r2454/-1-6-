fun main() {
    val numbers = IntArray(100) { (0..99).random() } // Генерируем 100 случайных чисел
    val groups = Array(10) { IntArray(10) }
    for (i in 0..99) {
        groups[i / 10][i % 10] = numbers[i]
    }
    for (i in 0..9) {
        println("Группа ${i + 1}: ${groups[i].joinToString(", ")}")
    }
}