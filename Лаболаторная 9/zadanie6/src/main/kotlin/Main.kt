fun b(a: Array<String>): Array<String>{
    return a.sortedArray()
}
fun main(){
    val a=arrayOf("moustache", "beard", "bald")
    val b =b(a)
    println("отсортированный массив по алфавиту: ${b.joinToString(", ")}")
}