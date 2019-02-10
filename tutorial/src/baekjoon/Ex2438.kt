package baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader

//fun main(args: Array<String>) = with(Scanner(System.`in`)) {
//    for (i in 1..nextInt()) {
//        println("${"*".repeat(i)}")
//    }
//}
fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    for (i in 1..Integer.parseInt(br.readLine())) {
        println("${"*".repeat(i)}")
    }
}