package fundamentos.operadores

data class Carro( val marca : String,  val modelo : String)

fun main() {
    val (marca,modelo) = Carro("Ford","Fusion")

    println("A marca e $marca e o modelo e $modelo")

    val (_,_,terceiroLugar) = listOf("Hamilton","Alonso","Rubinho")

    println(terceiroLugar)

}