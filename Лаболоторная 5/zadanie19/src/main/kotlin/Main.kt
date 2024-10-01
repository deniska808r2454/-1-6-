//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите высоту лестницы:")
    val a = readLine()!!.toInt()

    for (i in 1..a) {
        for (j in 1..i) {
            print("#")
        }
        println()
    }
}