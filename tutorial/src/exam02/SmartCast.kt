package exam02

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int{
    if (e is Num){
        val n = e as Num // 불필요한 타입 변환
        return n.value
    }

    if (e is Sum){
        return eval(e.left) + eval(e.right) // 변수 e에 대한 스마트 캐스트
    }

    throw IllegalArgumentException("Unknown expression")
}

fun eval2(e: Expr): Int =
    if (e is Num) {
        e.value
    } else if (e is Sum) {
        eval2(e.left) + eval2(e.right)
    } else {
        throw java.lang.IllegalArgumentException("Unknown expression")
    }

fun eval3(e: Expr): Int =
        when(e) {
            is Num -> e.value
            is Sum -> eval3(e.left) + eval3(e.right)
            else -> throw IllegalArgumentException("Unknown expression")
        }

fun main(arg: Array<String>){
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(eval2(Sum(Sum(Num(3), Num(3)), Num(4))))
    println(eval3(Sum(Sum(Num(10), Num(7)), Num(3))))
}