package collections

fun main() {
    val alunos = arrayListOf("Roberto","Amanda","Renata","Gabriela","Gabriel")

    for ((indice,aluno) in alunos.withIndex().sortedBy { it.value }){
        println("indice: $indice - $aluno")
    }
}