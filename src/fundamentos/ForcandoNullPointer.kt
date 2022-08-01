package fundamentos

fun main() {
    var a: Int? = null

    println(a?.inc())

    try {
        println(a?.inc())
    } catch (e: Exception) {
        println("Mensagem de erro: ${e.message}")
    }

}