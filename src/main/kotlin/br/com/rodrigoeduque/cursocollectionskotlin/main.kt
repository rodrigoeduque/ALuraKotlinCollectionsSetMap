package br.com.rodrigoeduque.cursocollectionskotlin

fun main() {

    val casa1 = listOf<String>("Ana", "Rodrigo")
    val casa2 = listOf<String>("Rogério", "Célia")
    val casa3 = listOf<String>("Rafaella", "Marquielcio", "Henrique", "Bingo")
    val casa4 = listOf<String>("Helio", "Marlene", "Maria Clara", "Angelo", "Miguel")
    val casa5 = listOf<String>("Angelo", "Maria Clara", "Miguel")
    val casa6 = listOf<String>("Regia", "Maria Clara", "Miguel")


    var todasCasas = casa1 + casa2 + casa3 + casa4 + casa5 + casa6

    println(todasCasas.distinct())
}

