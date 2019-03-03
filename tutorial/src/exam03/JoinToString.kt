package exam03

fun main() {
    val list = listOf(1, 7, 3, 8)
    println(joinToString(list, "; ", "(", ")"))  // 이 방법보단 아래 방법을 추천
    println(joinToString(list, separator="; ", prefix="(", postfix=")"))  // 명확하게 인자명을 입력하여 혼동을 막는다.
    // 또 하나라도 인자명을 명시하는 경우, 모든 인자명을 적어줘야 한다.
    println(joinToString2(list)) // default parameter
    println(joinToString2(list, "; "))
    println(joinToString2(list, postfix = " !", prefix = "* ")) // 인자명을 이용하면, 순서에 관계없이 넣을 수 있다.
}
fun<T> joinToString (collection: Collection<T>, separator: String, prefix: String, postfix: String): String {
    val result = StringBuilder(prefix)  // "("
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)  // "; "
        result.append(element)  // element
    }
    result.append(postfix)  // ")"
    return result.toString()  // ( element; element; ... )
}
// 자바에서는 코틀린이 만든 함수에 디폴트 인자값이 들어가있어도, 해당 기능을 제공하지 않기 때문에 모든 인자를 명시해야 한다.
// 해당 문제를 해결하기 위해 @JvmOverloads를 붙이면, 디폴트를 인자값이 들어간 메소드를 만들 수 있다.(정확히 하면 모든 경우의 메소드를 다 만들어준다.) 맨 아래 코드를 확인
@JvmOverloads
fun<T> joinToString2 (
    collection: Collection<T>,
    separator: String = ", ", // 인자를 넣지 않았을때, ", " 가 기본으로 들어가서 메소드가 호출된다.
    prefix: String = "", // 마찬가지로 ""(반 값)이 기본으로 들어가서 메소드가 호출된다.
    postfix: String = "" // 위와 동일
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

// @JvmOverloads를 사용하면, 아래와 같은 자바 메소드가 만들어짐.
//String joinToString(Collection<T> collection, String seperator, String prefix, String postfix);
//String joinToString(Collection<T> collection, String seperator, String prefix);
//String joinToString(Collection<T> collection, String seperator);
//String joinToString(Collection<T> collection);