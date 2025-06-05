package com.example.kotlinrevison.ui.KOTLIN.OOPS.oops

// Abstraction is the process of hiding implementation details and
// showing only the necessary functionality to the user.

//Interface used for 100% abstraction

abstract class Vehical{

    abstract fun start()  //Abstract method must be implemented in sub class


    fun stop(){           //This method will deirectly inherit to the class Car
        println("stop")
    }
}


class Car:Vehical(){
    override fun start() {
        println("car started")
    }
}

fun main() {
    val car=Car()
    car.start()
    car.stop()

    val addrs=Home()
    addrs.state()
    addrs.address()
}

//Interface is fully abstraction

interface Details{
    fun address()  //abstract method
    fun state()
}

class Home: Details{
    override fun address() {
        println("Address is Ajmer")
    }

    override fun state() {
       println("State is Rajasthan")
    }

}