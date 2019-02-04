package exam02

// return 값이 없는 함수
fun main(args: Array<String>){
    println(max(1,3))
    println(max2(4,100))
    println(max3(30, 20))
}

// return 값이 있는 함수
fun max(a: Int, b: Int): Int{
    return if(a > b) a else b
}

// 위 함수를 좀 더 간결하게 작성 가능
// 등호(=)를 사용하여 표현이 가능하다.
fun max2(a: Int, b: Int): Int = if(a > b) a else b

// 식이 본문인 함수의 경우는 반환 타입을 생략이 가능하다.
// 타입 추론(type inference)를 통해 컴파일러가 알아서 타입을 정해준다.
fun max3(a: Int, b: Int) = if(a > b) a else b