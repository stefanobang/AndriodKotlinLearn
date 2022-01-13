package org.techtown.andriodlab
//보조 생성자 선언
class ConstructorLearn{
    constructor(name: String){
        println("contructor(name: String) call..")
    }
    constructor(name: String, count: Int){
        println("contructor(name: String, count: Int) call..")
    }
}

/*
class User(name: String){
    constructor(name: String){ //=> 오류!! 반드시 주랑 보조 사용하면 연결해야함!
        .....
 */
class bothConstructor(name: String) {
    constructor(name: String, count: Int):this(name) {
        println("bothConstructor(name: String) and constructor(name: String, count: Int):this(name)....")
    }
}

fun main() {
    val user1 = ConstructorLearn("Stef1")
    val user2 = ConstructorLearn("stef2",10)
    val user3 = bothConstructor("stef3",30)

}