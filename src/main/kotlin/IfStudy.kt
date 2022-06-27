fun main(args: Array<String>) {
    // if 문 - 조건문
    val a = 100
    val b = 20

    if (a == 10 || a == 5) {    // or 연산자 활용 ( || ) 한 줄 이상 코드를 짤 때는 중괄호를 열어야 한다.
        println("a는 10 입니다.")
        println("a는 10 입니다.")
    }
    else if (a == 100)
        println("a는 100 입니다.")
    else
        println("a는 10이 아닙니다.")

    if (a == 5 && b == 20) // and 연산자 활용 ( && )
        println("a는 5이고 b는 20 입니다.")
    else
        println("실패")

    // when 조건 문
    // when 조건 문 - if 문이랑 동일하게 조건을 비교하는 식을 만드는 것이지만, 좀 더 가독성 있게 보여지게 만들 수 있음.
    when (a) {
        1 -> { }
        2 -> { }
        100 -> {
            println("a는 100입니다.")
        }
        else -> {
            println("실패")
        }
    }
}