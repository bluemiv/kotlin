fun main(args: Array<String>){
    println("Hello world!");
    println(sum(1,2));

    // val : 읽기 전용 변수
    val a:Int = 1;
    val b = 2;
    // b = 3 // 재할당 불가능

    // var : Mutable 변수
    var x = 5;
    x += 1;

    // String Interpolation 문자열 보간법
    // $를 이용해서 값을 문자열안에 불러올 수 있음.
    val s1 = "a is $a";
    print(s1);
}

// return 생략 가능
fun sum(a:Int, b:Int) = a + b

// Unit : void의 역할
// Unit은 생략이 가능
fun printKotlin(): Unit{
    println("Kotlin");
}

// 함수 내부 if문도 한줄로 표현이 가능
fun maxOf(a:Int, b:Int):Int{
    if(a>b){
        return a;
    }else{
        return b;
    }
}
fun maxOf2(a:Int, b:Int) = if(a>b) a else b

// nullable
fun parseInt(str:String):Int?{
    // 정수가 아닌경우 null
    return Integer.parseInt(str)
}

fun printProduct(arg1:String, arg2:String){
    val x:Int? = parseInt(arg1)
    val y:Int? = parseInt(arg2)
    if(x != null && y != null){
        println(x * y)
    }else{
        println("either '$arg1' or '$arg2' is not a number.")
    }
}