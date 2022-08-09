package funcoes


inline fun transacao(funcao: () -> Unit) {

    println("abrindo transacao")
    try {
        funcao()
    }catch (e : Exception){
        println("fechando transacao")
    }
}

fun main() {
    transacao {
        println("Executando SQL 1 ....")
        println("Executando SQL 2 ....")
        println("Executando SQL 3 ....")
        println("Executando SQL 4 ....")
    }
}