fun calcular( n1: Int, n2: Int ): Triple<Boolean, Int, Int> {
    if (n1 < 0 || n2 < 0){
        return Triple(false,0,0)
    }else{
        return Triple(true, n1 + n2, n1 * n2)
    }
}
fun main(){
    val t1 = calcular(-1,2)
    println(t1)
}