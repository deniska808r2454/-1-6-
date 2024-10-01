//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("10 случайных чисел от 1 до 100:")
    for (i in 1..10) {
        val randomNum = .nextInt(1, 101) // Генерирует случайное число от 1 до 100 (включительно)
        print("$randomNum ")
    }
    println()
}