package br.com.rodrigoeduque.cursocollectionskotlin.teste

import br.com.rodrigoeduque.cursocollectionskotlin.modelo.BancoNomes

fun testaCollection() {
    val banco = BancoNomes()
    val novoBanco = banco.nomes

    banco.salvar("Rodrigo")

    println(novoBanco)
    println(BancoNomes().nomes)
}