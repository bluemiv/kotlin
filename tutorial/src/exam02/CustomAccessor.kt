package exam02

import java.util.*

class Rectangle(val height: Int, val width: Int){
    val isSquare: Boolean
        // getter 선언
//        get() = height == width
        get(){
            return height == width
        }
}

fun main(args: Array<String>){
    val rectangle = Rectangle(43, 45)
    println("Answer : ${rectangle.isSquare}")

    val rectangle2 = Rectangle(50, 50)
    println("Answer : ${rectangle2.isSquare}")

    val random = Random()
    val rectangle3 = Rectangle(random.nextInt(), random.nextInt())
    println("Answer(${rectangle3.height}, ${rectangle3.width}) : ${rectangle3.isSquare}")
}