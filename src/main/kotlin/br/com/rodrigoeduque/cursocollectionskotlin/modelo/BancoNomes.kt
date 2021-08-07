package br.com.rodrigoeduque.cursocollectionskotlin.modelo

class BancoNomes {
    val nomes: Collection<String> get() = dados.toList()

    fun salvar(nome: String) {
        dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}