package com.example.kotlinpractice

fun main() {

}

//1. 함수

fun helloWorld() {
    println("Hello World!")
}

fun add(a:Int, b:Int) : Int {
    return a+b
}

//2. val vs var
//val = value, var = variable

fun hi() {
    val a : Int = 10
    var b : Int = 9

    var e : String

    b = 100

    val c = 100
    var d = 100

    var name = "yujin"

}

//4. 조건식

fun maxBy(a : Int, b : Int) : Int {
    if (a > b) {
        return a
    } else{
        return b
    }
}

fun maxBy2(a : Int, b : Int) = if(a>b) a else b

fun checkNum(score : Int) : Unit{
    when(score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2, 3-> println("this is 2 or 3")
        else -> println("I don't know")
    }

    var b = when(score) {
        1 -> 1
        2 -> 2
        else -> 3
    }

    when(score) {
        in 90..100 -> println("You are genius")
        in 10..80 -> println("Not bad")
        else -> println("okay")
    }
}

fun array() {
    val array = arrayOf(1, 2, 3)
    val list = listOf(1, 2, 3)

    val array2 = arrayOf(1, "d", 3.4f)
    val list2 = listOf(1, "d", 11L)

    array[0] = 3
    list.get(0)
    var result = list.get(0)

    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)

}

// 6. for / while

fun forAndWhile(){
    var students = arrayListOf<String>("joice", "james", "jenny", "jennifer")

    for (name in students){
        println("${name}")
    }

    var sum : Int = 0
    for (i in 1..10 step 2) {
        sum += i
    }
    println(sum)

    for (i in 10 downTo 1){
        sum+=i
    }

    for(i in 1 until 100){ //1부터 99까지. (1..10은 1부터 100까지)
        sum+=i
    }

    for((index, name) in students.withIndex()){
        println("${index+1}번째 학생 : ${name}")
    }

    var index = 0
    while(index < 10) {
        println("corrent index : ${index}")
        index++
    }
}

//7. Nullable / NonNull

fun nullcheck(){
    //NPE : Null pointer Exception

    var name = "yujin" //default 로 NN

    var nullName : String? = null

    var nameInUpperCase = name.toUpperCase()

    //값이 null이면 null을 반환. 아니면 함수 실행(추론)
    var nullNameInUpperCase = nullName?.toUpperCase()

    // ?:

    val lastName : String? = null

    //lastName이 null이면 "NO LastName"을 반환. 아니면 변수값 반환.
    val fullName = name + " " + (lastName?: "NO LastName")

    println(fullName)

}

//!!
// 지양하는 것이 좋다. ? 혹은 ?:를 이용하자.

fun ignoreNulls(str : String?) {
    val mNotNull : String = str!!
    val upper = mNotNull.toUpperCase()

    val email : String? = "byj0773@gmail.com"

    //email이 null인 경우에만
    email?.let{
        println("my email is ${email}")
        println("my email is ${it}")
    }
}

