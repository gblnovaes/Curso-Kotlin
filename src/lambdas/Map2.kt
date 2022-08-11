package lambdas


class Produto(val nome:String, val preco : Double)

val materialEscolar = listOf(Produto("Fichario Escolar",21.90),
Produto("Lapis de Cor",11.90),
Produto("Borracha Incolor",0.70),
Produto("Apontador com Depositor",1.80)
)
fun main() {
    val totalizador = {total : Double, atual : Double -> total + atual}
    val precoTotal = materialEscolar.map {
        it.preco
    }.reduce(totalizador)

    println(precoTotal/ materialEscolar.size)
}