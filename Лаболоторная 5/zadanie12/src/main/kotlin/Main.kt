//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите начальное число:")
    val a = readLine()!!.toInt()
    println("Введите шаг:")
    val f = readLine()!!.toInt()

    println("Числовая последовательность:")
    for (i in 0..10) {
        print("${a + i * f} ")
    }
    println()
}