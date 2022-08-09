package fundamentos.classes


class Geladeira(val marca: String, val litros: Int)
data class Televisao(val marca: String, val polagadas: Int)

fun main() {
    val g1 = Geladeira("Brastemp", 792)
    val g2 = Geladeira("Brastemp", 792)

    println(g1 == g2)
    val tv1 = Televisao("Sansung", 54)
    val tv2 = Televisao("Sansung", 54)

    println(tv1 == tv2)

    println(tv1.toString())

    println(tv1.copy(polagadas = 40))


}