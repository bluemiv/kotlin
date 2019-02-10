package exam02

fun getMnemonic (color: Color) = when(color) {
    Color.RED -> "Richard"
    Color.ORANGE -> "Of"
    Color.YELLOW -> "York"
    Color.GREEN -> "Gave"
    Color.BLUE -> "Battle"
    Color.INDIGO -> "In"
    Color.VIOLET -> "Vain"
}

// 여러개의 값을 하나의 분기에 표현할 때는 쉼표(,)를 이용
fun getMnemonic2 (color: Color) = when(color) {
    Color.RED, Color.ORANGE, Color.YELLOW -> "warm"
    Color.GREEN -> "neutral"
    Color.BLUE, Color.INDIGO, Color.VIOLET -> "cool"
}

fun getMnemonic3 (color: Color, color2: Color) = when(setOf(color, color2)) {
    setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
    setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
    setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO
    else -> throw Exception("Dirty Color")
}

fun mixOptimized(c1: Color, c2: Color) =
        when { // when의 분기조건이 없다.
            // 분기 조건이 없으려면, Boolean 결과를 계산하는 식이어야 함
            (c1 == Color.RED && c2 == Color.YELLOW) || (c1 == Color.YELLOW && c2 == Color.RED) -> Color.ORANGE
            (c1 == Color.YELLOW && c2 == Color.BLUE) || (c1 == Color.BLUE && c2 == Color.YELLOW) -> Color.GREEN
            (c1 == Color.BLUE && c2 == Color.VIOLET) || (c1 == Color.VIOLET && c2 == Color.BLUE) -> Color.INDIGO
            else -> throw Exception("Dirty Color")
        }

fun main(args: Array<String>){
    println(getMnemonic(Color.RED))

    println(getMnemonic2(Color.BLUE))

    println(getMnemonic3(Color.RED, Color.YELLOW))
    println(getMnemonic3(Color.BLUE, Color.VIOLET))
    println(getMnemonic3(Color.VIOLET, Color.BLUE))
    println(getMnemonic3(Color.RED, Color.BLUE))

    println(mixOptimized(Color.RED, Color.YELLOW))
    println(mixOptimized(Color.BLUE, Color.VIOLET))
    println(mixOptimized(Color.VIOLET, Color.BLUE))
    println(mixOptimized(Color.RED, Color.BLUE))
}