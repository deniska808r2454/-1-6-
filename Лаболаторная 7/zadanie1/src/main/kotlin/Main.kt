import java.util.

fun main() {
    val scanner = Scanner(System.`in`)

    while (true) {
        println("Введите выражение (например, 1 + 2):")
        val expression = scanner.nextLine()

        if (expression == "exit") {
            break
        }

        try {
            val result = calculate(expression)
            println("Результат: $result")
        } catch (e: Exception) {
            println("Ошибка: ${e.message}")
        }
    }
}

fun calculate(expression: String): Double {
    val parts = expression.split(" ")
    if (parts.size != 3) {
        throw IllegalArgumentException("Неверный формат выражения.")
    }

    val num1 = parts[0].toDoubleOrNull()
    val operator = parts[1]
    val num2 = parts[2].toDoubleOrNull()

    if (num1 == null || num2 == null) {
        throw IllegalArgumentException("Неверные числа.")
    }

    return when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "" -> num1  num2
                "/" -> {
            if (num2 == 0.0) {
                throw ArithmeticException("Деление на ноль.")
            }
            num1 / num2
        }
        else -> throw IllegalArgumentException("Неверный оператор.")
    }
}