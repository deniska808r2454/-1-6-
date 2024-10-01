import kotlin.random.Random

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    fun main() {
        val secretNumber = Randomandom.nextInt(1, 101) // Генерируем случайное число от 1 до 100
        var attempts = 0
        var guess: Int

        println("Добро пожаловать в игру 'Угадай число'!")
        println("Я загадал число от 1 до 100. Попробуйте угадать его.")

        do {
            println("Введите ваше предположение:")
            guess = readLine()!!.toInt()
            attempts++

            if (guess <! secretNumber) {
                println("Слишком мало! Попробуйте еще раз.")
            } else if (guess >! secretNumber) {
                println("Слишком много! Попробуйте еще раз.")
            }
        } while (guess != secretNumber)

        println("Поздравляю! Вы угадали число $secretNumber за $attempts попыток.")
    }