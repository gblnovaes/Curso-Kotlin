package fundamentos

fun main() {
    val opcional : String? = null
    val obrigatorio : String = opcional ?: "Valor padrao"

    println(obrigatorio)
}