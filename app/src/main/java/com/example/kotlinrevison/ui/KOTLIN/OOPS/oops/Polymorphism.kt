package com.example.kotlinrevison.ui.KOTLIN.OOPS.oops

// one function multiple forms

// there are two types of methods in polymorphism

//compile time polymorphism (Method overloading) - Same function differnet parameters

// Runtime Polymorphism (Method overriding) - Same function different behaviour in sub class


//Compile time
class Calculator{

    fun add(a:Int,b:Int): Int{
        return a+b
    }

    fun add(a: Int,b: Int,c: Int): Int{
        return a+b+c
    }

}

//fun main() {
//    val calculate= Calculator()
//    println(calculate.add(2,8))
//}


//Run time polymorphism  method ovveriding

open class Animal{
    open fun makesound(){
        println("animal makes sound")
    }
}

open class Dog: Animal(){             //overriding the function from parent class
   open override fun makesound() {
        println("dog barks")
    }
}

class cat: Dog(){
    override fun makesound() {  //overriding the function from parent class
        println("cat meows")
    }

}

fun main() {
    val animal= cat()
    animal.makesound()
}



