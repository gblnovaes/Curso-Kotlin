package classes

class Filme3 {
    val nome: String
    val anoLancament: Int
    val genero: String

//    init {
//        this.nome = nome
//        this.genero = genero
//        this.anoLancament = anoLancament
//    }

    constructor(nome: String, anoLancament: Int, genero: String) {
        this.nome = nome
        this.genero = genero
        this.anoLancament = anoLancament
    }

}

fun main() {
    val filmes3 = Filme3("Os Incriveis", 2004, "Acao")
    println("A ${filmes3.genero} ${filmes3.nome} foi lancada em ${filmes3.anoLancament}")
}

