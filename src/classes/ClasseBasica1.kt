package classes


class Cliente{
    var nome : String = ""
}

fun main() {
    val cliente = Cliente()
    cliente.nome = "Ribeiro Matheus"

    println("O cliente se chama ${cliente.nome}")
}