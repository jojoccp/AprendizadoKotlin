package com.jonatas.AprendizadoKotlin.CursoDouglasMotta

class Pessoa (

    val nome: String,
    val idade: Int
)

fun main() {
    val pessoa1: Pessoa = Pessoa("Jonatas", 29)
    val pessoa2: Pessoa = Pessoa("Sabrina", 34)

    println("Pessoa 1: ${pessoa1.nome}, Idade:${pessoa1.idade}")
    println("Pessoa 1: ${pessoa2.nome}, , Idade:${pessoa2.idade}")
}