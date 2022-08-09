package classes

 data class Data(var dia:Int,var mes:Int,var ano : Int){
   fun formatar() : String{
   return "$dia/$mes/$ano"
  }
 }

fun main() {
 var nascimento = Data(dia = 11, mes = 10, ano = 2018)
 println(nascimento.formatar())
}