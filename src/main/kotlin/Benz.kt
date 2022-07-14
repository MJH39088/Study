class Benz : Car() {
    // 메소드 오버라이드 (Method Override) 부모 클래스의 메소드를 재정의 할 수 있다.
    // 오픈된 메소드를 Ctrl + o를 눌러 오버라이드 해 올 수 있다.
    // super의 뜻은 상속한 부모 클래스를 뜻함. 즉 이 클래스는 Car를 뜻한다.
    override fun start() {
        println("벤츠 ")
        // 부모 클래스의 start 메소드를 호출해라!!
        super.start()
    }

    override fun stop() {
        println("벤츠 ")
        super.stop()
    }

    // ()는 인자를 받아오기 위함
    // : Int로 return 값을 받을 수 있게 함으로서 이 메소드를 변수에 넣을 수 있게 되었음.
    fun calculateNumber(a : Int, b : Int) : Int {
        println(a + b)
        return a + b
    }
}