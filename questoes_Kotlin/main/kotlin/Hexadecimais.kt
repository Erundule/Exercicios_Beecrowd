import kotlin.math.pow

fun contaHexadecimal(valores: List<String>): Map<Int, Int> {
    val tabelaHex = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F")
    val mapFinal = mutableMapOf<Int, Int>()
    var valorInt = 0
    var unidadeInt = 0
    var contador = 0

    for (hexadecimals in valores) {
        for (unit: Int in 0..hexadecimals.split("").size - 3) {
            println("unit $unit")
            for (tries in tabelaHex) {
                if (hexadecimals.reversed().uppercase()[unit].toString() == tries) {
                    unidadeInt = tabelaHex.indexOf(tries)
                }
            }
            println("unidadeInt $unidadeInt")
            unidadeInt *= tabelaHex.size.toDouble().pow(contador).toInt()

            println("unidadeDec $unidadeInt")
            valorInt += unidadeInt
            contador++
        }

        contador = 0
        println("INTVALUE $valorInt")

        if (mapFinal.containsKey(valorInt)) {
            mapFinal[valorInt] = mapFinal[valorInt]!! + 1
        } else {
            mapFinal += (valorInt to 1)
        }
        valorInt = 0
    }

    return mapFinal.toMap()
}


fun main () {
    val meta = 213
    val listaProva = listOf("123AbC", "321cBA", "1F53e", "2654", "aFC", "321cBA", "1F53e")
    contaHexadecimal(listaProva)
}