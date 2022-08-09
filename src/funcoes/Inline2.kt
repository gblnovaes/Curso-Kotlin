package funcoes

inline fun <T>executarComLog(nome : String,funcao : ()-> T) : T {
    println("Entrando no metodo $nome")
    try {
        return funcao()
    }finally {
        println("Metodo $nome finalizado")
    }
}

fun somar(a: Int , b : Int) :Int {
    return a+b
}

fun main() {
    val resultado = executarComLog("somar"){
        somar(2,5)
    }

    println(resultado)
}