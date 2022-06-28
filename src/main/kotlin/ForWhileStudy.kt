fun main(args: Array<String>) {
    // for - 반복문
    var arrayTest = IntArray(10)
    arrayTest[0] = 1
    arrayTest[1] = 2
    arrayTest[2] = 3
    arrayTest[3] = 4
    arrayTest[4] = 5
    arrayTest[5] = 6
    arrayTest[6] = 7
    arrayTest[7] = 8
    arrayTest[8] = 9
    arrayTest[9] = 10

    // for 문 예제 1
    for (item in arrayTest)
        println(item)

    // for 문 예제 2
    var arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(12)
    arrayList.add(113)
    arrayList.add(230)
    arrayList.add(570)
    arrayList.add(54)
    arrayList.add(89)
    arrayList.add(73)
    for (i in arrayList)
        println(i)

    // for 문 예제 3
    var sum: Int = 0
    for(i in 1..10) {
        sum += i
    }
    println(sum)

    // for 문 예제 4
    for (item in arrayList) {
        if (item > 100) {
            println(item)
        }
    }

    // while 문 - 무한 반복문
    // while - ~하는 동안..
    var a = 10
    while (a < 20) {
        println("a가 1씩 증가됩니다!")
        a++
    }
    println("while 문 끝")

}