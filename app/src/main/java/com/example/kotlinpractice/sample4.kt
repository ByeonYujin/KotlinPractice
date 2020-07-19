package com.example.kotlinpractice

//Singleton Pattern. 딱 한 번 생성된다.
object CarFactory {
    val cars = mutableListOf<Car>()
    fun makeCar(horsePoser: Int) : Car{
        val car = Car(horsePoser)
        cars.add(car)
        return car
    }
}

data class Car(val horsePoser : Int)

fun main() {
    val car = CarFactory.makeCar(10)
    val car2 = CarFactory.makeCar(200)

    println(car)
    println(car2)
    println(CarFactory.cars.size.toString())
}