
import java.text.SimpleDateFormat
import java.util.*

class Horario(private val horaEminuto: String) {
    fun horas(): Int {
        val (hora, minuto) = horaEminuto.split(':').map(String::toInt)
        return hora
    }

    fun minutos(): Int {
        val (hora, minuto) = horaEminuto.split(':').map(String::toInt)
        return minuto
    }
}
class Hora(){
    fun formato(): Date{
        val formato= SimpleDateFormat("kk:mm")
        val horaFormatada = formato.parse(horario)
        return horaFormatada
    }
}


enum class Veiculos{
    CARRO,
    MOTO
}
class Cliente(val placa:String, val horaEntrada:Date, val horaSaida: Date, val tipo: Enum<Veiculos>, val valor: Int){
}

class Estacionamento{
    fun entrada(): Map<String, String> {
        val placa = readLine()!!.toString()
        val horaEntrada = readLine()!!.toString()
        val tipoVeiculo = readLine()!!.toString()
        return mapOf(placa to tipoVeiculo)
    }
    fun saida(){
        val horaSaida= readLine()!!.toString()
        val placa = readLine()!!.toString()
    }

}
fun menuInicial(){
    println("+".repeat(48))
    println("BOM DIA. BEM VINDO AO SISTEMA DO ESTACIONAMENTO.")
    println("+".repeat(48))
    println("Informe a opção desejada:\n" +
    "1 - Entrada de veículo\n" +
    "2 - Saída de veículo\n" +
    "3 - Listar veículos no estacionamento\n" +
    "4 - Calcular faturamento do dia\n" +
    "5 - Encerrar programa\n")
    println("Digite a opção desejada:")
}

fun main(){
    while(true){
        menuInicial()
        val primeiraEntrada= readLine()!!.toInt()
        when(primeiraEntrada){
            1-> Estacionamento().entrada();
            2-> Estacionamento().saida();
            /*
            3-> Estacionamento().;
            4-> Estacionamento().;
            5-> Estacionamento().
             */
        }

    }
}

