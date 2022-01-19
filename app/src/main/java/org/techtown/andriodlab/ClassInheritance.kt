package org.techtown.andriodlab

open class Super{ //조상 클래스
    open var someData = 10
    open fun superClassfunc(){
        println("fun superClassfunc printing: $someData")
    }
}
class Sub: Super() {//조상 클래스 이어 받기
    override var someData = 20
    override fun superClassfunc(){
        println("fun sub class printing: $someData")
    }
}
//데이터 클래스 알아보기
class NonDataClass(val name: String, val email: String, val age: Int)
data class DataClass(val name: String, val email: String, val age: Int)

//object 클래스 알아보기....
//obj 클래스를 위한 상위 클래스
open class ClassForObj {
    open var data = 30
    open fun some(){
        println("super data: $data")
    }
}

val obj = object: ClassForObj() {//상위 클래스 상속
    override var data = 10 //오버라이드

    override fun some(){ //오버라이드
        println("obj data: $data")
    }
}
//Companion class 예시..
class MyClass{
    companion object{
        var data = 10
        fun some(){
            println(data)
        }
    }
}


fun main(){
    val objSub = Sub()
    objSub.superClassfunc()

    //comparing normal class with data class
    val nonData1 = NonDataClass("stef","a@hotmail.com",10)
    val nonData2 = NonDataClass("stef","a@hotmail.com",10)

    val data1 = DataClass("stef","a@hotmail.com",10)
    val data2 = DataClass("stef","a@hotmail.com",10)

    println("non data class equals: ${nonData1.equals(nonData2)}")
    println("data class equals: ${data1.equals(data2)}")
    /* 결과:
        non data class equals: false
        data class equals: true
     */

    //printing object class
    obj.data = 30 //성공
    obj.some() //성공

    //companion data
    val obj = MyClass()
    //obj.data =20     //오류
    //obj.some()       //오류
    MyClass.data =20 //성공
    MyClass.some() //성공

}
