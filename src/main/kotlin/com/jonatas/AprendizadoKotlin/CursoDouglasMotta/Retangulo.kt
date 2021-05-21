package com.jonatas.AprendizadoKotlin.CursoDouglasMotta

//Acessores customizados
class Retangulo(val altura: Int, val largura: Int) {

    val isQuadrado: Boolean
        get() {
            return altura == largura
        }

//    val isQuadrado
//        get() = return altura == largura
//
//    PODE SER ASSIM TAMBÉM


}

fun main() {
    val retangulo: Retangulo = Retangulo(11, 10)
    println(retangulo.isQuadrado)
}