package baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

// BufferedReader 이용해서 풀기
fun main(args: Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    for (i in 1..Integer.parseInt(br.readLine())) {
        val input = br.readLine()
        val st = StringTokenizer(input, " ")
        val a = Integer.parseInt(st.nextToken())
        val b = Integer.parseInt(st.nextToken())
        println("Case #${i}: ${a} + ${b} = ${a + b}")
    }
}

// Scanner 이용해서 풀기
//fun main(args: Array<String>) = with(Scanner(System.`in`)) {
//    for (i in 1..nextInt()) {
//        val a = nextInt()
//        val b = nextInt()
//        println("Case #${i}: ${a} + ${b} = ${a + b}")
//    }
//}