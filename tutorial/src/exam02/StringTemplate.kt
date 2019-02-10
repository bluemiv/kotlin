package exam02

fun main(args: Array<String>){
    val name = if(args.size > 0) args[0] else "Kotlin"
    println("Hello, $name!") // 자바의 ("Hello, " + name + "!") 와 같은 표현식
    println("\$name")

    if (args.size > 0){
        println("args[0] : ${args[0]}") // 중괄호({})를 통해서 복잡한 식도 문자열에 넣을 수 있다.
    }

    // Tip. 중괄호를 사용해서 하는 것을 추천한다. 왜냐하면, 아래와 같은 이유...
    val answer = "Hongku"
//    println("$answer안녕")
    println("${answer}안녕")

    // 응용
    println("Hello, ${if (args.size > 0) args[0] else "someone"}!")
}