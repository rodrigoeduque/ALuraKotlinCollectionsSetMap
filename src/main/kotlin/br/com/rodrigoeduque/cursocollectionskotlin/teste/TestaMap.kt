package br.com.rodrigoeduque.cursocollectionskotlin.teste

fun testaMap(pedidos: MutableMap<Int, Double>) {
    print("Usando Map")
    println(pedidos)

    print("Pegando valor -> ")
    println(pedidos[1]) // -->Perceba que não temos a chave vai imprimir null
    val pedido = pedidos[10]

    pedido?.let { println("Pedido $it") } // -> usando o let podemos fazer o nullsafe

    for (p in pedidos) {
        println("------------------------------")
        println("Número Pedido: ${p.key}")
        println("Valor Pedido: ${p.value}")
        println("------------------------------")
    }

    pedidos[4] = 90.00
    println(pedidos)
    pedidos.put(6, 145.45)
    println(pedidos)
}