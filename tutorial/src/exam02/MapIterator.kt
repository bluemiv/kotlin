package exam02

import java.util.*

fun main(args: Array<String>) {
    val binaryReps = TreeMap<Char, String>()
    for (c in 'A'..'G') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }
    // 출력
    for ((letters, binary) in binaryReps) {
        println("${letters} : ${binary}")
    }
    val list = arrayListOf("00", "01", "10", "11")
    for ((index, item) in list.withIndex()) {
        println("${index}의 이진수 : ${item}")
    }
}