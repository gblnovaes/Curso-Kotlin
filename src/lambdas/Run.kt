package lambdas

data class Casa(var endereco : String ="",var num: Int = 0)

fun main() {
    var casa = Casa()

    casa.apply {
        endereco="Rua das camelhas"
        num=123
    }

    println(casa)
}