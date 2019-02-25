package exam03

fun main() {
    val set = hashSetOf(1, 2, 3) // 집합 만들기

    val list = listOf(1, 50, 400) // List 만들기

    val map = hashMapOf(1 to "one", 2 to "two", 3 to "three", "a" to "A") // Map 만들기 - 여기서 to는 키워드가 아닌 메소드이다.
    println(map["a"])

    // 어떤 클래스에 속해있는지 알고 싶을떄, javaClass를 사용한다.
    println("Set: ${set.javaClass}")
    println("List: ${list.javaClass}")
    println("Map: ${map.javaClass}")
    // 위 결과를 보면, 코틀린만의 콜렉션 기능이 있는것이 아니다.
    // 기존의 자바 콜렉션을 이용하고 있기 때문에, 자바와 상호작용하기 쉽다.

    // 하지만, 코틀린에서는 자바보다 더 많은 기능을 사용할 수 있다.
    val strings = listOf(10, 5, 80, 55, 4, 9)
    println("First: ${strings.first()}")
    println("Last: ${strings.last()}")
    println("Max: ${strings.max()}")
    println("Min: ${strings.min()}")
    println(strings) // toString()이 구현되어 있다.
}