fun main(args: Array<String>) {
    // Nullable (?)  : 널을 허용한다. (Null은 값이 비어있다라는 뜻)
    // Non-Null (!!) : 널이 아니다.

    // 코틀린은 기본적으로 변수 초기화 시 non-null type 이다.
    var a : String = "abcdef"
    println(a)

    // 타입 뒤에 ? 를쓰면 non-null이라도 null 허용 변수 뒤 붙이면 null 이어도 에러가 나지 않는다.
    // 변수뒤에 !!를 붙이면 절대 null이 올 수가 없음 에러가 남. 개발자라면 !!를 잘 쓰면 안되고 ?를 써야한다.
    var b : String? = null

    println(b?.length)
}