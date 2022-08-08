object ArmstrongNumbers{
    fun check(input: Int): Boolean{
        val inputString = input.toString()
        val qtdDigitos = inputString.length
        var acum = 0
        for (digito in inputString){
            val digitoInt = digito.digitToInt()
            val potencia = Math.pow(digitoInt.toDouble(), qtdDigitos.toDouble())
            acum += potencia.toInt()
        }
        return input == acum
    }
}