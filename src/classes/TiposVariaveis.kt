package classes

const val diretamenteNoArquivo = "Bom dia"

fun topLevel(){
    val local = "Fulano"
    println("$diretamenteNoArquivo $local")
}

class Coisa {
    var varivelDeInstancia : String = "Boa Noite"

    fun imprima(name : String){
        varivelDeInstancia = name
        println(name)
    }

    companion object{
        @JvmStatic val constateDeClasse = "Ciclano"

        @JvmStatic fun testeObject(){
            println("Objeto de Companion")
        }
    }

    fun fazer(){
        val local : Int = 7

        if (local > 3){
            val variavelDeBloco = "Beltrano"
            println("$varivelDeInstancia, $constateDeClasse,$local e $variavelDeBloco")
        }
    }
}

fun main() {
    topLevel()
   Coisa().fazer()
    println(Coisa.constateDeClasse)
    Coisa.testeObject()
}