package com.jonatas.AprendizadoKotlin.CursoDouglasMotta

fun main(){
    println(max1(10, 5))
}

//corpo de bloco
fun max(a: Int, b: Int): Int {
    return if(a > b) a else b
}

//corpo de expressao
fun max1(a: Int, b: Int): Int = if(a > b) a else b