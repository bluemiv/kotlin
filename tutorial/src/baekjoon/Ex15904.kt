package baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine()

    var i = 0
    for (c in input) when(i){
        0 -> if (c == 'U') i++
        1, 3 -> if (c == 'C') i++
        2 -> if (c == 'P') i++
    }

    println("I ${if (i == 4) "love" else "hate"} UCPC")
}