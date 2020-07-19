package com.example.kotlinpractice

data class Ticket(val companyName : String, val name : String, var date : String, var seatNumber : Int)
//toString(), hashCode(), equals(), copy()

class TicketNormal(val companyName : String, val name : String, var date : String, var seatNumber : Int)

fun main(){
    var ticketA = Ticket("KoreanAir", "kildongHong", "2020-07-19", 14)
    var ticketB = TicketNormal("KoreanAir", "kildongHong", "2020-07-19", 14)

    println(ticketA) //값들을 보기 쉽게 출력
    println(ticketB) //data address 출력
}