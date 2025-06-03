package com.example.kotlin.KotlinProgramming.OOPS

// Class is a Blueprint of a Object

class Person{
    fun name(){
        println("person name is yash")
    }
}

//Constructor in kotlin is a sepcial function that used
// to create class when an object is created


//Primary Constructor

class Student constructor(val name:String,val age:Int){
    fun details(){
        println("name is $name and age is $age")
    }
}

//Secondary Constructor

class Employee{
    var name:String
    var age:Int

    constructor(name:String,age:Int){
        this.name=name
        this.age=age
    }

    fun details(){
        println("name is $name and age is $age")
    }
}

//init block
//The init block is executed as soon as the object is created,before any other function run


class Car(val carname:String,val modal:Int){

    fun cardetails(){
        println("carname is $carname and modal is $modal")
    }

    init {
        println("Welcome to BMW")
    }
}

fun main() {

    val name=Person()
    name.name()

    val student =Student("yash",22)
    student.details()

    val emp=Employee("yash",22)
    emp.details()

    val car=Car("BMW",2025)
    car.cardetails()

}