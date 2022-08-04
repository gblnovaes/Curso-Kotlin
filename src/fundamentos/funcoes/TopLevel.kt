package fundamentos.funcoes


fun min(a : Int,b : Int) : Int = if(a < b) a else b

fun max(a : Int, b :  Int) : Int = if(a > b) a else b


fun main() {
    println("O menor valor e${min(10,16)}")
}