fun main(args: Array<String>) {
    val person : Person = Person(name = "허민재", age = 24) // 클래스 인스턴스 생성 (주 생성자 활용)
    // Person 클래스에서 val로 선언하면 오류가 난다. 가져오는 행위밖에 못 하기 때문
    // setter 를 활용하여 새로운 값 설정
    person.name = "허민재99"
    person.age = 22
    // getter 를 활용해서 설정된 값을 가져와 출력
    println(person.name + " " + person.age)

    var person2 : Person = Person("허민재", 24, 181)
}