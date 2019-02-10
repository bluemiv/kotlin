package exam02

// Kotlin의 기본 scope는 public이므로, public을 생략 할 수 있다.
class Person(var name: String)

// 클래스라는 개념의 목적은 데이터를 캡슐화(encapsulate)하고, 캡슐화한 데이터를 다루는 코드를 하나의 주체안에 가두기 위함이다.

// 자바에서는 필드(field)를 이용하여 데이터를 저장하고, 보통 접근가능한 범위는 private 으로 설정한다.
// 그래서, 해당 데이터에 접근하기위해 접근자 메소드(getter, setter)를 사용한다.

// 프로퍼티(property)는 필드와 접근자를 하나로 묶은 것을 칭한다.

class Person2(
    val name: String, // 읽기 전용 프로퍼티로 private field와 public getter 함수를 생성한다.
    var age: Int, // 쓰기도 가능한 프로퍼티로 private field와 public getter, public setter 함수를 생성한다.
    var isMerried: Boolean
)

fun main(args: Array<String>){
    val person = Person2("Hongku", 27, true)
    person.isMerried = false
    println("Name : ${person.name}")
    println("Age : ${person.age}")
    println("isMerried : ${person.isMerried}")
}