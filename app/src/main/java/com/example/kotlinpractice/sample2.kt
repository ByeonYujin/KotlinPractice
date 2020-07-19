package com.example.kotlinpractice

// lamda -> value 처럼 다룰 수 있는 익명함수
// 1) 메소드의 파라미터로 넘겨줄 수 있다. fun maxBy(a : Int)
// 2) return 값으로 사용할 수가 있다.

val square : (Int) -> (Int) = {number -> number*number}
val square2 = {number : Int -> number*number}

val nameAge = {name : String, age : Int ->
    "my name is ${name} I'm ${age}"
}

fun main(){
    println(square(12))
    println(nameAge("yujin", 23))

    val a = "man said"
    val b = "woman said"

    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString("ariana", 27))

    println(calculateGrade(97))

    val lamda = {number : Double ->
        number == 4.3213 // Boolean값 return
    }

    println(invokeLamda(lamda))
    println(invokeLamda({true}))
    println(invokeLamda({it > 3.22}))

    invokeLamda { it > 3.22 } // lamda식이 마지막 parameter일 경우 생략 가능. it은 하나의 parameter를 가리킨다.


}

// 확장함수

val pizzaIsGreat : String.() -> String = {
    this + "Pizza is the best!" //return
}

fun extendString(name : String, age : Int) : String {
    val introduceMyself : String.(Int) -> String = {"I am ${this} and  ${it}years old"} // parameter가 하나면 it으로 지칭이 가능하다.
    return name.introduceMyself(age)
}

//람다의 Return

val calculateGrade : (Int) -> String = {
    when (it){
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error"
    }
}

//람다 표현 방식

fun invokeLamda(lamda : (Double) -> Boolean) : Boolean {
    return lamda(5.2343)
}
