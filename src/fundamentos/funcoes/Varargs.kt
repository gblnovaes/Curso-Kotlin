package fundamentos.funcoes

fun ordenar(vararg numeros : Int) :IntArray{
    return numeros.sortedArray()
}

fun main() {
    for (n in ordenar(20,1,22,122,3,124,56,77,8,990,0,78,85,25)){
        println("$n")
    }
}