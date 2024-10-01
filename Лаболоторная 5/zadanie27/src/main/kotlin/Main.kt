//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите число N:")
    val n = readLine()!!.toInt()

    for (i in 1..n) {
        // Вывод пробелов
        for (j in 1..n - i) {
            print("  ")
        }
        // Вывод чисел
        for (j in 1..i) {
            print("$j ")
        }
        // Вывод чисел в обратном порядке
        for (j in i - 1 downTo 1) {
            print("$j ")
        }
        println()
    }
}