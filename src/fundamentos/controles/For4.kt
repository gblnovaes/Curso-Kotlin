package fundamentos.controles

fun main() {
    var alunos = listOf<String>("Andre","Roberto","Miguel","Renan","Maria")

    for ((indice,aluno) in alunos.withIndex()){
        println("${indice+1} - $aluno")
    }
}