fun main() {
    val a = 2
    val d = 3
    val n = 10
    val arithmeticProgression = IntArray(n) { a + d  it }
    println(arithmeticProgression.contentToString()) // Вывод: [2, 5, 8, 11, 14, 17, 20, 23, 26, 29]
}