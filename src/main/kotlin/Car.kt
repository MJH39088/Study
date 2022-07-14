open class Car {
    // 생성자와 초기화 블럭

    // 속성 (프로퍼티)
    var carName : String = ""
    var carColor : String = ""
    var carMaxSpeed : Int = 0

    // 함수 (메소드)
    open fun start() {
        // 필요한 행동들을 정의
        println("자동차가 출발 하였습니다.")
    }

    open fun stop() {
        println("자동차가 멈추었습니다.")
    }
}