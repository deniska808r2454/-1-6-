fun isAnagram(a: String, b: String): Boolean {
    if (a.length != b.length) {
        return false
    }
    val c = mutableMapOf<Char, Int>()
    val c2 = mutableMapOf<Char, Int>()
    for (char in a.lowercase()) {
        c[char] = (c[char] ?: 0) + 1
    }
    for (char in b.lowercase()) {
        c2[char] = (c2[char] ?: 0) + 1
    }
    return c == c2
}
fun main(){
    val a ="listen"
    val b = "silent"
    if(isAnagram(a,b)){
        println("$a and $b: anagram")
    } else {
        println("$a and $b: no anagram")
    }
}