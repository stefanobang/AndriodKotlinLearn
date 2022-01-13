package org.techtown.andriodlab
//보저 생성자 선언
class ConstructorLearn{
    constructor(name: String){
        println("contructor(name: String) call..")
    }
    constructor(name: String, count: Int){
        println("contructor(name: String, count: Int) call..")
    }
}

fun main() {
    val user1 = ConstructorLearn("Stef1")
    val user2 = ConstructorLearn("stef2",10)

}