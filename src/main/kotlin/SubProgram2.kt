fun main(args: Array<String>) {
    // 컬렉션 (map)
    // map - key, value 하나의 키에는 하나의 밸류 중복x 다시 쓸 시 덮어쓰기가 됨
    // 불변형 vs 가변형
    // 불변형 : 요소를 추가 또는 삭제를 할 수가 없다. (mapOf)
    val foods : Map<Int, String> = mapOf(1 to "chicken", 2 to "icecream", 3 to "kimchi")
    println(foods.get(3))   // 키 값으로 밸류 출력
    println(foods.values)   // 밸류 값 출력
    println(foods.keys)     // 키 값 출력

    // 가변형 : 요소를 얼마든지 추가 또는 삭제 할 수 있다. (mutableMapOf) mutable = 가변
    val cars : MutableMap<String, String> = mutableMapOf()
    cars.put("cars1", "benz")
    cars.put("cars2", "avante")
    cars.put("cars3", "k5")

    println(cars.get("cars1"))

    cars.remove("cars1")

    println(cars.get("cars1")) // null : 비어있다.

    cars.put("cars1", "ferari")
    cars.put("cars1", "truck")

    println(cars.get("cars1"))  // 동일 키값으로 쓰면 덮어 쓰기로 저장함.
    println(cars.size)          // map 에 put 되어있는 전체 크기
}