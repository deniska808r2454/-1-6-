import kotlin.random.Random
fun main(){
    for(i in 1..10){
        val a =Random.nextInt(1,101)
        println("Случайное число $i: $a")
    }
}