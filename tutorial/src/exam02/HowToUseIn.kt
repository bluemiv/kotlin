package exam02

// in을 이용하여 범위의 원소 검사하기
fun isLetter (c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit (c: Char) = c !in '0'..'9'

// when을 이용해서 사용할 수도 있다.
fun recognize (c: Char) = when(c) {
    in '0'..'9' -> "It is digit!"
    in 'a'..'z', in 'A'..'Z' -> "It is letter!"
    else -> "I don't know..."
}

fun main(args: Array<String>) {
    println("A : ${isLetter('A')}")
    println("9 : ${isNotDigit('9')}")

    for (c in '0'..'z') {
        println("${c} : ${recognize(c)}")
    }

    println("Kotlin" in "Java".."Scala")
    println("Kotlin" in setOf("Java", "Scala"))
}