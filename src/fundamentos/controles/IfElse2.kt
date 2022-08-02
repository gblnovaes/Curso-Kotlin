package fundamentos.controles


fun main() {
    val num1 = 2
    val num2 = 3

    val maiorValor = if (num1 > num2) {
        println("processando")
        num1
    }else{
        println("processando")
        num2
    }

    println("O maior valor eh:  $maiorValor")
}