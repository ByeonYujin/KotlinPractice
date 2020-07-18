package com.example.kotlinpractice


open class Human constructor(val name : String = "Anonymous") {

    //overloading
    constructor(name : String, age : Int) : this(name){
        println("my name is ${name}, ${age}years old.")
    }

    //가장 먼저 실행
    init{
        println("New human has been born!!")
    }

    fun eatingCake(){
        println("This is so Yummy")
    }

    open fun singASong(){
        println("lalala")
    }
}

class Korean : Human(){
    //overwriting
    override fun singASong(){
        super.singASong()
        println("랄랄라")
        println("my name is ${name}")
    }
}



fun main(){
    var human = Human("minsu") // new keword 필요 없음
    var stranger = Human() //defalut 값("Anonymous")이 있으므로 가능.

    human.eatingCake()

    println("This human's name is ${human.name}")
    var korean = Korean()
    korean.singASong()
}