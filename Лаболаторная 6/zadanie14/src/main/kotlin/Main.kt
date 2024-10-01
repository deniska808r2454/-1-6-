fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val prokopenkoNumbers = numbers.filter { it % 3 == 0 }
    println("Числа Прокопенко: ${prokopenkoNumbers.joinToString(", ")}")
}



