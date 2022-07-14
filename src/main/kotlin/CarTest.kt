fun main(args: Array<String>) {
    // 클래스 인스턴스 생성
    // 자바의 Car car = new Car()와 같음
    var car = Car()
    car.carName = "벤츠"
    car.carColor = "회색"

//    println(car.carName)
//
//    // 메소드 호출
//    car.start()
//    car.stop()

    var benz = Benz()
    benz.start()
    // 메소드 타입은 기본 Unit타입이다. 자바로 void. 즉 return 값이 없다.
    // 이런 식으로 result로 return 값을 받으려면 메소드를 타입으로 정의해줘야 한다. : Int 이것이 없으면 에러가 난다.
    val result : Int = benz.calculateNumber(28, 92)
    println(result)
}
