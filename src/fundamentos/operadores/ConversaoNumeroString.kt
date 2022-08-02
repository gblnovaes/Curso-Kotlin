package fundamentos.operadores

fun main() {
    val a = 1


    println(a.toString() + 1)

    println("1.9".toDouble()+ 4)

    println("Teste".toIntOrNull())
    println("Teste".toIntOrNull()?: 0)
    println("1".toInt() + 3)
}