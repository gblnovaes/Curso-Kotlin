package classes


class Cliente2 {

    constructor(nome:String){
        this.nome = nome
    }

    var nome:String
    get() = "menu nome e $field"
    set(value) {
      field = value.takeIf { value.isNotEmpty() } ?: "Anonimo"
    }
}

fun main() {
    val c1 = Cliente2("Roberto")
    println(c1.nome)

    val c2 = Cliente2("")
    println(c2.nome)
}