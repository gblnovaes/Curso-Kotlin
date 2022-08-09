package funcoes


fun relacaoDeTrabalho(chefe : String,funcionario : String): String {
    return "$funcionario e subordinado a $chefe"
}

fun main() {
    println(relacaoDeTrabalho("Joao","Maria"))
    println(relacaoDeTrabalho(funcionario = "Renato", chefe = "Maria"))
}