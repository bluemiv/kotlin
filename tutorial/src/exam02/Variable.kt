package exam02

fun main(args: Array<String>){
    // 타입을 생략해도 되고...
    val question = "삶, 우주, 그리고 모든 것에 대한 궁극적인 질문"
    val answer = 42
    println("question : $question")
    println("answer : $answer")

    // 타입을 명시해도 됨
    val answer2: Int = 45
    println("answer2 : $answer2")

    val yearsToCompute = 7.5e6
    println("yearsToCompute : $yearsToCompute")

    // 초기화를 하지 않고, 변수를 생성하고 싶다면 타입을 명시해줘야 한다.
    val answer3: Int
    answer3 = 50
    println("answer3 : $answer3")
}