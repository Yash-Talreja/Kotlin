package com.example.kotlinrevison.ui.KOTLIN.Collection

fun main() {

    val fruits =mutableListOf<String>("apple","banana","cherry","Orange")

    println(fruits)
    fruits[0]="grapes"
    println(fruits)
    println(fruits.size)



    val map =mutableMapOf("one" to 1,"two" to 2,"three" to 3)

    println(map)
    map.remove("three")


    println(map)
}