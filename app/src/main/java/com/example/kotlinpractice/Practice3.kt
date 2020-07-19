package com.example.kotlinpractice

class Book private constructor(val id : Int, val name : String){

    //java의 static과 비슷한 역할
    companion object BookFactory : idProvider{

        override fun getId(): Int {
            return 444
        }

        val myBook = "new book"

        fun create() = Book(getId(), myBook)
    }
}

interface idProvider {
    fun getId() : Int
}

fun main() {
    val book = Book.create()

    val bookId = Book.BookFactory.getId()
    println("${book.id}, ${book.name}")
}