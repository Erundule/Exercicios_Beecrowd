/*interface Comparavel<T>{
    fun comparar(outro: T): Int
}
data class Candidato(val nome: String, val nota: Double)

class ComparadorOrdemAlfabetica: Comparavel<Candidato>{
    override fun comparar(a1: Candidato?, a2: Candidato?): Int{
        if (a1 == null || a2 == null){
            return 0
        }
        return a1.nome.compareTo(a2.nome, true)
    }

}
fun main(){
    
}*/