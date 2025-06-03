package com.example.kotlin.KotlinProgramming.Function

fun main() {

    greet("Yash",22)

    println( add(20,20))

    printData("yash")
    printData(20)

    val p=Person("yash")
    p.introduce()
}

fun greet(name:String,age:Int){
    println("my name is $name and my age is $age")
}

fun add(a:Int,b:Int):Int //Explicit typ of function
{
    return a+b
}

//Generic FUnction can work with any type of database

fun <T> printData(data:T){
    println("data is $data")
}

//lamda function is function that is assigned by a variable not with a name

val sum:(Int,Int)->Int={a,b->a+b}

val greet:(String) -> String={name->"Hello $name"}


// High Order function is a function that takes another function as a parameter or returns one


fun greetings(name: String,action:(String) -> String):String{

    return action(name)
}

// member function

class Person(val name: String){
    fun introduce(){
        println("my name is $name")

    }
}