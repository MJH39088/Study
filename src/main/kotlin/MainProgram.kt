fun main(args: Array<String>) {
    // 프로그램이 첫 시작되는 수행 지점. (메인 함수) fun : 함수
    println("Hello, World!!")

    // var는 변수가 언제든지 바뀔 수 있다.
    // val은 변수를 설정하면 절대 바뀌지 않고 고정된다. final 같은 것

    // 변수
    // 1. 변할 수 있는 수 (값)
    // 2. 값을 저장해 놓는 공간
    var a = 1 // 1+1 = 2 의 ' = ' 의 표현과는 다르게 이해해야 한다.
    println(a)

    var a2 = "허민재"
    println(a2)

    a = 1230

    // 변수명을 지을때에는 관련된 의미를 부여하는 것이 헷갈림을 방지한다.
    var fruitName = "사과"
    println(fruitName)

    // 선언 (값이 할당되기 전에 타입 지정을 하고 변수를 선언 하는 과정)
    var a3 : String
    // 초기화 (값을 최초로 할당을 함.)
    a3 = "내용"

    val abc = 350
    println(abc)

    var b : String              // 문자열
    var b2 : Int                // 정수형
    var b3 : Boolean = false    // True or False 논리타입
    var b4 : Float = 0.123F     // 실수형 (소수) 접미어로 F가 붙어야한다.
    println(b4)

}