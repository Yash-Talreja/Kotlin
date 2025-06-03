package com.example.kotlinrevison.ui.KOTLIN.OOPS.oops

//in Inheritance properties of parent class inheritated in child class

open class Parent(){
    val inherit="inheritance"

    fun inheritance()
    {
        println(inherit)
    }
}


class child(): Parent(){

    fun Child(){
        println("get inheritate form parent")
    }
}


fun main() {

    val childeren= child()
    childeren.inheritance()
    childeren.Child()
}