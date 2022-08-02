package fundamentos.controles

fun main() {

    var opcao = -1

    do {
        println("Informa um valor ou -1 para sair: ")
        var line = readLine() ?: "0"

        opcao = line.toIntOrNull() ?: 0

        println("Voce escolheu a opcao $opcao")

    }while (opcao != -1)
}