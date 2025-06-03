package com.example.kotlinrevison.ui.KOTLIN.OOPS.oops

//Encapsulation is the practice of hiding the internal details
// of how an object works and only exposing necessary parts.

//we usually use access modifiers

// private-Only accessible in same class
// public -Accessible within the same module
// protected-accessible inside the same class and sub class
// internal-Accessable everywhere

//PRIVATE
class Example{

    private val secretdata="Hidden"

    private fun secret(){   //private member function can only be accessed in its class
        println(secretdata)
    }
    fun data(){
        println("data")
    }
}


//PROTECTED

open class protecteddata{
   protected val protected="protected data"

    protected fun showdata(){
        println(protected)
    }
}

class data:protecteddata(){   //protected data will be initilaize in same class or in sub class
    fun show(){
        showdata()
    }
}

//INTERNAL

//Accessible within the same module



fun main() {

    val obj= Example()
    obj.data()

//    obj.secret()  this is a private object that only be initialized in its class not outside it

    val p= data()
    p.show()  //protectd data can be initialized by the inherit class function but not by its parent class

}