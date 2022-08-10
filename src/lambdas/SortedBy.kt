package lambdas


fun main() {
    val nomes = arrayListOf("Zuleica", "Robson", "Gabriel", "Vanessa", "Andreia", "Caio", "Bernardo", "Renata")
    val ordernados = nomes.sortedBy { it.reversed() }
    println(ordernados)

}