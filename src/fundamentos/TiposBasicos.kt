package fundamentos


fun main(args: Array<String>) {
    //Tipos numericos Inteiros
    val num1:Byte = 123
    val num2:Short = 32767
    val num3:Int = 2_147_483_647
    val num4:Long = 9_223_372_036_854_775_807

    // Tipos numericos reais
    val num5: Float = 3.14F
    val num6: Double = 3.14

    // Tipo Caracter
    val char : Char = 'G'

    // Tipo booleano
    val isBoolean = true // ou false

    println(
        listOf(num1,num2,num3,num4,num5,num6,char,isBoolean)
    )

}