package com.example.kotlin.KotlinProgramming.OOPS


//data class help to store data and creating database
data class User(
    var name:String,
    var age:Int
)

//Enum class use to define constant value

enum class Direction{
    NORTH,SOUTH,EAST,WEST
}

//sealed class is very similar to enum class but used to define restricted hierarchy
//we can also build multiple classes inside sealed class

sealed class Shape(){
    class Circle(var radius: Int):Shape()
    class Square(var length:Int):Shape()
    class Rectangle(var length:Int,var breadth:Int):Shape()

    fun area()=when(this){
        is Circle->3.14f*radius*radius
        is Square->length*length
        is Rectangle->length*breadth
    }


}


fun main() {

    val user1=User("yash",22)
    val user2=User("satyam",22)

    println(user1.name)
    println(user1.age)
    println(user2.name)
    println(user2.age)


    ////////////////////

    val direction=Direction.NORTH
    val direction1=Direction.SOUTH
    val direction2=Direction.EAST
    val direction3=Direction.WEST

    println(direction)
    println(direction1)
    println(direction2)
    println(direction3)

    //////////////////////

    val s1=Shape.Circle(2)
    val s2=Shape.Square(2)
    val s3=Shape.Rectangle(2,3)

    println(s1.area())
    println(s2.area())
    println(s3.area())

    //////////////////////


}



