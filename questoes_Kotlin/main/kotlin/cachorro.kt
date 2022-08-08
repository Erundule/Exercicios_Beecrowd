class Cachorro {
    fun latir(n: Int){
        for (i in 1..n){
            println("Au!")
        }
    }
    fun latir(n: Int, dizer: String){
        for(i in 1..n){
            println(dizer)
        }
    }
fun main(){
    val c = Cachorro()
    c.latir(3)
    c.latir(2, "woof")
    }
}
