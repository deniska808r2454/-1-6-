import kotlin.random.Random

fun generatePassword(length: Int): String {
    val chars = ('a'..'z') + ('A'..'Z') + ('0'..'9') + listOf('!', '@', '#', '$', '%', '^', '&', '*', '(', ')')
    return (1..length)
        .map { Random.nextInt(chars.size) }
        .map { chars[it] }
        .joinToString("")
}
fun main() {
    println("Введите длину пароля:")
    val A = readLine()?.toIntOrNull() ?: 8
    val B = generatePassword(A)
    println("Сгенерированный пароль: $B")
}