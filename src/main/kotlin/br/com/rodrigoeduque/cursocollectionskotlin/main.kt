package br.com.rodrigoeduque.cursocollectionskotlin

fun main() {

    val pedidos = listOf<Pedido>(
        Pedido(1, 20.0),
        Pedido(2, 30.0),
        Pedido(3, 80.0),
        Pedido(4, 220.0),
        Pedido(5, 350.0),
        Pedido(6, 40.0),
        Pedido(7, 55.0),
        Pedido(8, 63.0),
        Pedido(9, 789.0),
        Pedido(10, 541.0),
    )

    val listaNomes = listOf<Nome>(
        Nome("Rodrigo"), Nome("Marcos"), Nome("Alice"), Nome("Maria"), Nome("Henrique"), Nome("Ana"), Nome("Rogério")
    )

    println("Pedidos")
    println(pedidos)

    val pedidosMapeados = pedidos.associate { pedido -> Pair(pedido.numero, pedido) }

    println("Pedidos Mapeados ")
    println(pedidosMapeados)

    println("Pedidos Mapeados usando associateBy")
    val associateBy = pedidos.associateBy { p -> p.numero }
    println(associateBy)

    println("Pedidos Mapeados usando AssociateWith")
    val associateWith = pedidos.associateWith { pedido -> pedido.valor > 50 }
    println(associateWith)

    println("Pedidos Mapeados usando GroupBy")
    val groupBy = pedidos.groupBy { pedido -> pedido.valor > 50 }
    println(groupBy)

    println("Nomes Mapeados usando GroupBy")
    val nomesAgrupados = listaNomes.groupBy { nome -> nome.nome.first() }.toSortedMap()
    println(nomesAgrupados)
}

data class Pedido(val numero: Int, val valor: Double)

data class Nome(val nome: String)
