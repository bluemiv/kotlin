package exam02

fun main(args: Array<String>){
    // val : value의 약어, 변경 불가능(immutable)한 변수 (자바로 치면 final에 해당한다.)
    val message = "Hello"
    //message = "world" // 문법 오류
    println("meaasge : $message")

    // var : variable의 약어, 변경이 가능(mutable)한 변수 (자바로 치면 일반 변수와 같다.)
    var myNum = 40
    myNum = 30
    println("myNum : $myNum")

    // TIP. 모든 변수를 val을 이용해 immutable한 변수로 선언하고, 나중에 꼭 필요할때만 var로 사용하는 것을 추천한다.

    // val 변수는 한번만 초기화 되는것이 맞지만, 컴파일러가 문맥을 봤을때 한번만 초기화되는것이 맞다면 상황에 따라 val을 여러 값으로 초기화 가능하다.
    val msg:String
    if (isSuccess()){
        msg = "Success"
    }else{
        msg = "Fail"
    }
    println("msg : $msg")

    // val은 변경이 불가능 하더라도, 참조가 가르키고 있는 객체의 내부값은 변경될 수 있다.
    val myArray = arrayListOf("Java") // val로 초기화하여 immutable한 변수를 생성
    myArray.add("Python") // 참조가 가르키는 객체 내부를 변경 가능
    println("myArray : $myArray")


    // var를 사용하여 한번 초기화를 했을때, 타입은 이미 정해져있어서 추후에 타입을 변경할 수 없다. (컴파일러는 초기화 식으로 변수의 타입을 추론한다.)
    // 만약 타입을 변경하고 싶다면, 강제 형 변환(coerce)을 해야한다.
    var answer = 45
    //answer= "no answer" // Error : Type mismatch
    println("answer : $answer")

}

fun isSuccess() = true