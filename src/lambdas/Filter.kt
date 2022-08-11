package lambdas

data class Aluno(val nome:String,val nota: Double)


fun main() {
    val listaDeAlunos = arrayListOf<Aluno>(
        Aluno("Roberto",5.9)
    , Aluno("Renato",9.7), Aluno("Renata",5.9), Aluno("Artur",8.3)
    )

    val aprovados = listaDeAlunos.filter { it.nota >= 7.0  }.sortedBy { it.nota }
    println(aprovados)
 }