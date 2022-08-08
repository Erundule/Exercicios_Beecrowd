class Pomekon {
    var ataque: Double = 0.0
    var defesa: Double = 0.0
    var level: Double = 0.0
    var bonus: Double = 0.0

    fun atacar(): Double{
        var resultado = (this.ataque + this.defesa) / 2.0
        if (level % 2.0 == 0.0){
            resultado += bonus
        }
        return resultado
    }

    fun main(){
        val batalhas = readLine()!!.toInt()
        var nivel = 0.0
        for (indice in 1..batalhas){
            nivel = readLine()!!.toDouble()
            var dabriel = Pomekon()
            var entradas = readLine()!!.split("")
            dabriel.ataque = entradas[0].toDouble()
            dabriel.defesa = entradas[1].toDouble()
            dabriel.level = entradas[2].toDouble()
            dabriel.bonus = bonus

            entradas = readLine()!!.split("")
            var guarte = Pomekon()
            guarte.ataque = entradas[0].toDouble()
            guarte.defesa = entradas[1].toDouble()
            guarte.level = entradas[2].toDouble()
            guarte.bonus = bonus
            if(dabriel.atacar() < guarte.atacar()){
                println("Guarte")
            }else if (dabriel.atacar() > guarte.atacar()) {
                println("Dabriel")
            }else{
                println("Empate")
            }
        }
    }
}