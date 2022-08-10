package classes


enum class DiaSemana2(val id: Int, val nome: String, val util: Boolean) {
    DOMINGO(1, "Domingo", false),
    SEGUNDA(2, "Segunda", true),
    TERCA(3, "Terca", true),
    QUARTA(4, "Quarta", true),
    QUINTA(5, "Quinta", true),
    SEXTA(6, "Sexta", true),
    SABADO(7, "Sabado", false)
}

fun main() {
    for (dia in DiaSemana2.values()) {
        println("${dia.nome} e um dia ${if (dia.util) "util" else "do fim de semana"}.")
    }
}