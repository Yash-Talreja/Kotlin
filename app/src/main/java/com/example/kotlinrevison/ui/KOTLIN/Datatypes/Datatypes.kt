package com.example.kotlinrevison.ui.KOTLIN.Datatypes

fun main() {

    val a: String="yash"
    val b: Int=20;
    val c: Double=12.2
    val d: Char='A'
    val e: Float=20.45f

    val f: Boolean=true
    val g: Boolean=false

    val numbers:Array<Int> = arrayOf(1,2,3,4,5)
    val mixed=arrayOf(1,2,"yash",true,false,25.25f)

    val name: String=readln()
    println("your name is $name")

    println(mixed.joinToString())
    println(numbers.joinToString())

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(g)
}