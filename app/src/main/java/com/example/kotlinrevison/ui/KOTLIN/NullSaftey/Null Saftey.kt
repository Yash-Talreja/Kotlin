package com.example.coroutines.ui.theme.NullSaftey

fun main() {
    var name: String? = "Yash Talreja"

    // Safe call(call methods only if it not null)
    println("Length: ${name?.length}")

    // Elvis operator(Provides Default value)
    val length = name?.length ?: 0
    println("Length with default: $length")

    // Not-null assertion(Crashes if null)
    println("Forced length: ${name!!.length}")

    // Safe let(Execute only if not null)
    name?.let {
        println("Name in uppercase: ${it.uppercase()}")
    }

    // Changing name to null
    name = null

    // Avoiding crash using safe call
    println("Length after null: ${name?.length}")
}

