package com.example.kotlin.KotlinProgramming.Interface

//interface known as the blue print of a function

//different class can use same interface function

//A class can handle multiple interfaces

class Dog:Animal {
    override fun makesound() {
        println("DOG Barks !")
    }
}

class Car:Engine,wheels

class C :A,B{
    override fun show() {
        super<A>.show()
    }
}

fun main() {

    val dog=Dog()
    dog.makesound()

    val car=Car()
    car.start()
    car.wheels()

    val c=C()
    c.show()

}




