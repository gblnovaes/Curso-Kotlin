package classes


class Filme {
    val nome: String
    val anoLancamento: Int
    val genero: String

    constructor(nome: String, anoLancamento: Int, genero: String = "Nao Informado") {
        this.genero = genero
        this.nome = nome
        this.anoLancamento = anoLancamento
    }
}

fun main() {
    val filme = Filme(nome = "Poderoso Chefão", anoLancamento = 1972, genero = "Drama")
    println("${filme.nome} foi lancado em ${filme.anoLancamento} ")
}