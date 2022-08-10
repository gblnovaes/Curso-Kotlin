package classes

data class Filmes2(val nome:String,val anoLancamento : Int,val genero : String)

fun main() {
    val filmes2 = Filmes2("Monstros S.A",2001,"Comedia")
    println("A ${filmes2.genero} ${filmes2.nome} foi lancada em ${filmes2.anoLancamento}")
}
