package fundamentos

import fundamentos.pacoteA.simpleFuncao as FuncaoSimples
import fundamentos.pacoteA.Coisa
import fundamentos.pacoteA.FaceMoeda.CARA
import  fundamentos.pacoteB.*


fun main() {
    println("OK")

    val coisa = Coisa("Bola")
    println(coisa.nome)
    println(CARA)

    println(soma(10,20))

    println(FuncaoSimples("Hello World"))
}