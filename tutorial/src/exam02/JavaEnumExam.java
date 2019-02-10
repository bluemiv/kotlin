package exam02;

public class JavaEnumExam {

    // 일반적인 상수 선언 방법
    public static final String MONDAY = "MONDAY";
    public static final String TUESDAY = "TUESDAY";
    public static final String WEDNESDAY = "WEDNESDAY";
    public static final String THURSDAY = "THURSDAY";
    public static final String FRIDAY = "FRIDAY";
    public static final String SATURDAY = "SATURDAY";
    public static final String SUNDAY = "SUNDAY";

    public static void main (String[] args) {
        String day;

        day = JavaEnumExam.MONDAY;
        System.out.println("처음 값 : " + day);

        day = "none"; // 실수로 요일과 상관없는 값을 넣어도 컴파일 에러가 생기지 않는다.
        System.out.println("바뀐 후" + day);


        Day day_enum;
        day_enum = Day.MONDAY;
        System.out.println("Enum 클래스를 사용한 경우 : " + day_enum);
//        day_enum = "none"; // 컴파일 에러 발생 -> 실수 방지 가능

    }

}

// Day라는 enum class 생성
enum Day{
    MONDAY,TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}