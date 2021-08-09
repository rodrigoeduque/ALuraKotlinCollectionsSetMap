package br.com.rodrigoeduque.cursocollectionskotlin.teste

fun testeSet() {
    val casa1: MutableSet<String> = mutableSetOf("Ana", "Rodrigo")
    val casa2: Set<String> = setOf("Rogério", "Célia")
    val casa3: Set<String> = setOf("Rafaella", "Marquielcio", "Henrique", "Bingo")
    val casa4: Set<String> = setOf("Helio", "Marlene", "Maria Clara", "Angelo", "Miguel")
    val casa5: Set<String> = setOf("Angelo", "Maria Clara", "Miguel")
    val casa6: Set<String> = setOf("Regia", "Maria Clara", "Miguel")


//    val todasCasas:Set<String> = casa1 + casa2 + casa3 + casa4 + casa5 + casa6
//    todasCasas.addAll(casa1)
//    todasCasas.addAll(casa2)
//    todasCasas.addAll(casa3)
//    todasCasas.addAll(casa4)
//    todasCasas.addAll(casa5)
//    todasCasas.addAll(casa6)
//    println("Buscando pelo ID : ${todasCasas[0]}")


//    println("Devolve objeto completo : $todasCasas")
//    println("Usando Distinct : ${todasCasas.distinct()}")

    print("Union -> ")
    println(casa1.union(casa2).union(casa3))
    print("Subtract -> ")
    println(casa4.subtract(casa5))
    print("Intersect -> ")
    println(casa4.intersect(casa5))
}