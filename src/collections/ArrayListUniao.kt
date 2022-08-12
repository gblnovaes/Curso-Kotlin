package collections

fun main() {
    val numeros = arrayListOf(1,2,3,4,5)
    val strings = arrayListOf("Rafael","Ronaldo","Gabriel")
    val uniao = numeros + strings

    for (item in uniao){
        println(item)
    }
 }