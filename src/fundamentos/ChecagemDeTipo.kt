package fundamentos

fun main() {
    var valor = "abc"

    if (valor is String) {
        println(valor)
    } else if (valor !is String) {
        println("Nao e uma String")
    }
}
