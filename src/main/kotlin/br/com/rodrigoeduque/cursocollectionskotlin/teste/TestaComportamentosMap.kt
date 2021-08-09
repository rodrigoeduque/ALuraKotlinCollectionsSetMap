package br.com.rodrigoeduque.cursocollectionskotlin.teste

fun testaComportamentosMap() {
   val pedidos = mutableMapOf(
       Pair(1, 20.0),
       2 to 30.00,
       3 to 450.00,
       4 to 500.00,
       5 to 30.00,
       6 to 1500.00
   ) //ifix perde em performance - nesse caso usar o Pair


////    val valorPedido = pedidos.get(5)
//    val numeroPedido = pedidos.keys
//    val valorPedido = pedidos.getValue(5)
//    println("Testando get() => \nNumero Pedido: $numeroPedido\nValor Pedido: $valorPedido")

   val getOrElse = pedidos.getOrElse(515, { 0.0 })
   println(getOrElse)

   val getOrDefault = pedidos.getOrDefault(153, 0.00)

   println(getOrDefault)

   val pedidosfiltrados = pedidos.filter { (numero, valor) ->
       valor >= 30
   }

   print("Usando Filter - > ")
   println(pedidosfiltrados)
}