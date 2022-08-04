package fundamentos.funcoes


fun <E>List<E>.secondOrNull() : E? = if(this.size >= 2) this.get(1) else null


fun main() {

    val lista = listOf(1,"2",3,4)

    println(lista.secondOrNull())
}