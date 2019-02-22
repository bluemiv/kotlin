package exam02

import java.io.BufferedReader
import java.io.StringReader

fun main() {
    // Exception 던지기
    val percentage = 20
    if (percentage !in 0..100) {
        // 예외 인스턴스를 만들 때, new를 사용 할 필요없다.
        throw IllegalArgumentException("A percentage value must be between 0 and 100: ${percentage}")
    } else {
        println(percentage)
    }

    val reader = BufferedReader(StringReader("error"))
    println(readNumber(reader))
}

fun readNumber(reader: BufferedReader): Int? {
    // 사용하는 방식은 Java와 같다. try, catch, finally
    try {
        val line = reader.readLine()
        return Integer.parseInt(line) // 숫자 형식이 아닌 경우 에러 발생.
    } catch (e: NumberFormatException) {
        return null // 숫자 형식이 아님
    } finally {
        reader.close() // 정상적이든 오류든 무조건 실행
    }
}