package fundamentos.controles


fun main() {

    var opcao = 0

    while (opcao != -1){
        val line = readLine()?:"0"
        opcao = line.toIntOrNull() ?: 0

        println("Vc escolheu $opcao")

    }

    println("Ate a proxima")
}