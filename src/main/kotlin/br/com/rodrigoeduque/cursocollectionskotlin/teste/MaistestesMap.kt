package br.com.rodrigoeduque.cursocollectionskotlin.teste

fun maistestesMap() {
    val nomes = setOf("Alex", "Guilherme", "Fran")

    val nomesMaiusculo = nomes.map { n -> n.toUpperCase() }

    println(nomes)
    println(nomesMaiusculo)
    println(nomes)
}