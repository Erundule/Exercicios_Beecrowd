
/*fun Int.ehPar(): Boolean = this % 2 == 0
fun Int.ehImpar(): Boolean = !ehPar()

fun checarParidade(valor: Int): Boolean{
    return valor % 2 == 0
}

fun mainn(){
    val v1: Int = 4

    println(v1.ehPar())
    println(v1.ehImpar())

    checarParidade(4)
}

 */
class Tempo(val horas: Int = 0, val minutos: Int = 0, val segundos: Int = 0 ){
    fun paraSegundos(): Int = horas * 60 * 60 + minutos * 60 + segundos
}
//or
// fun paraSegundos(): Int{
// return  horas * 60 * 60 + minutos * 60 + segundos}
fun main(){
    val t1 = Tempo(horas = 1)

println(t1.paraSegundos())}
