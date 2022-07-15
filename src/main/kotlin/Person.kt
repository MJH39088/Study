class Person constructor(name: String, age: Int) {
    // var를 넣으면 getter setter 둘다 가능, val은 가져오는 행위밖에 못함
    // 주 생성자로부터 받은 매개변수를 초기화 할 때 활용
    var name : String = name
    get () {
        return field //field는 바로 위의 변수를 나타냄
    }
    set(value) {
        field = value + " haha"
    }

    var age : Int = age
    get () {
        return field //field는 바로 위의 변수를 나타냄
    }
    set(value) {
        field = value + 40
    }

    init {
//        println(name + " " + age)
    }
    // 보조 생성자 : this()를 넣어 주 생성자로부터 상속 받음
    constructor(_name : String, _age : Int, height : Int) : this(_name, _age) {
//        println(_name + " " + _age + " " + height)
    }

    // getter & setter
}