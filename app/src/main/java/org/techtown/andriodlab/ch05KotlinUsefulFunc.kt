package org.techtown.andriodlab
//lambda function (람다 함수)__________
//this is same as
/*
fun sum(no1: Int, no2: Int):Int{
    return no1 + no2
}
*/
//this
val sum = {no1: Int, no2: Int ->no1+no2}(10,20)
//___________

//매개변수 없는 람다 함수
//{-> println("function call")}
//___________

//일반 함수
/*
fun something(no1: Int, no2: Int):Int{
    return no1 + no2
}
*/
//함수 타입을 이용해 함수를 변수에 대입
val something:(Int,Int) ->Int = {no1: Int, no2: Int ->no1+no2}
//----------
//고차 함수 예시
fun hofFunc(arg: (Int)-> Boolean): ()->String{
    val result = if(arg(10)){
        "valid"
    }else{
        "invalid"
    }
    return {"hofFunc result: $result"}
}
//----------
fun errorCause(data: String?): Int{
    return data!!.length
}
//----------
//타입 별칭 typealias 예시!
typealias MyInt = Int
typealias MyFuncType = (Int, Int) -> Boolean
fun main() {
    //매개변수가 하나 일때 이렇게 가능
    val some1: (Int) -> Unit = { println(it)}
    some1(10)
    //-------

    //람다 함수의 반환문
    val some2 = {no1: Int, no2: Int ->
        println("lambda function")
        no1*no2 //lambda function return value (반환값)
    }
    println("result: ${some2(10,20)}")
    //------
    //타입 별칭 -typealias 예시!
    val somesortOfData1: Int = 10
    val somesortOfData2: MyInt = 10

    val someFun: MyFuncType = {no1: Int, no2: Int ->
        no1>no2
    }
    println(someFun(10,20))
    println(someFun(50,20))
    //-----
    //매겨변수 타입 선언 생략 예 (without typealias)
    val someFun2:(Int,Int) -> Boolean = {no1,no2 ->
        no1>no2
    }
    //-----
    //변수 선언 시 타입 생략
    val someFun3 = {no1:Int,no2:Int ->
        no1>no2
    }
    //---------
    //고차 함수 예시
    val result = hofFunc({no->no >0}) //'no' has parameter Int
    println(result())
    //널 안전성 호출 -?.연산자
    //널 포인터 예외 오류
    /*
    var data: String? ="Stefano!"  //?은 널 허용
    var lenght = data.length //error! (data는 널 허용이지만 lenght는 아니라서)
    */
    var data: String? ="Stefano!"  //?은 널 허용
    var lenght = data?.length //성공!

    //---------
    //엘비스 연산자 사용
    var data1: String? = "stefbang"
    println("data = $data1 : ${data1?.length}")
    println("data = $data1 : ${data1?.length?:-1}")
    data1 = null
    println("data = $data1 : ${data1?.length?:-1}")
    //---------
    //예외 발생 연산자
    println(errorCause("8Letters"))
    println(errorCause(null)) //cause error
}