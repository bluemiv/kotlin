package exam02

import java.io.BufferedReader
import java.io.StringReader
fun main() {
    // 코틀린에서는 try를 식으로 사용할 수 있다.
    val num = try {
        Integer.parseInt(BufferedReader(StringReader("not a number")).readLine())
    } catch(e: NumberFormatException) {
//        return
        null
    }
    println(num)
}