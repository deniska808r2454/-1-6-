//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите строку:")
    val a = readLine()!!.lowercase() // Преобразуем строку в нижний регистр

    if (isPalindrome(a)) {
        println("Строка является палиндромом")
    } else {
        println("Строка не является палиндромом")
    }
}

fun isPalindrome(str: String): Boolean {
    val d = str.reversed()
    return str == d
}