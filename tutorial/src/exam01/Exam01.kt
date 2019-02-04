data class Person(val name: String,
                  val age: Int? = null) // 추후에 설명하겠지만, Kotlin은 '?'를 통해서 null을 사용할 수 있는 파라미터라고 정의한다.

fun main(args: Array<String>){
    val persons = listOf(Person("John"), Person("Hongku", age=27))

    val oldest = persons.maxBy { it.age ?:0 }

    println("Oldest : $oldest") // $를 이용해서 문자열 안에서 변수값을 가져올 수 있다.
}