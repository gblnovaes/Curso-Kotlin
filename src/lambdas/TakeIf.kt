package lambdas


fun main() {
    println("Digite uma Mensagem: ")
    val entrada = readln()
    var mensagem = entrada.takeIf {
        it?.trim() != ""
                } ?: "Sem Mensagem"

    println(mensagem)
}