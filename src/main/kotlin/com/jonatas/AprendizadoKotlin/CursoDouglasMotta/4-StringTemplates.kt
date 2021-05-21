package com.jonatas.AprendizadoKotlin.CursoDouglasMotta

fun main() {
    val nome = "Jonatas"
    println("Hello $nome !")
    println("Hello \$nome !")

    println("A soma é: ${soma(10, 25)}")
}

fun soma(a: Int, b: Int): Int {
    return a+b
}