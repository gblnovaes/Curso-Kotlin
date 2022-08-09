package funcoes

class Produto(val nome:String,val preco:Double)

infix fun Produto.maisCaroQue(produto: Produto):Boolean = this.preco > produto.preco

fun main() {
    val p1 = Produto(nome = "Ipad", preco = 2349.00)
    val p2 = Produto(preco = 3.49, nome = "Borracha")

    println(p1 maisCaroQue p2)
}