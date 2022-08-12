package collections


fun main() {
    val listaMix = arrayListOf("Rafael",true,1,3.14,'p')

    for(item in listaMix){
        when (item) {
            is String -> {
                println(item.uppercase())
            }
            is Char -> {
                println(item.uppercase())
            }
            else -> {
                println(item)
            }
        }

    }
}