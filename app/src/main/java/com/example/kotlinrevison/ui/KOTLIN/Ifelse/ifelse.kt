package com.example.kotlinrevison.ui.KOTLIN.Ifelse

fun main() {
//    var age= readLine()?.toInt()
//
//    if (age != null) {
//        if (age>=18){
//            println("You are eligible to vote")
//        } else{
//            println("You are not eligible to vote")
//
//        }

    day()

    }


fun day(){

    val day= readLine()?.toInt()

    when(day){
        1->println("Monday")
        2->println("Tuesday")
        3->println("Wednesday")
        4->println("Thursday")
        5->println("Friday")
        6->println("Saturday")
        7->println("Sunday")
        else ->  println("Invalid day")
    }
}