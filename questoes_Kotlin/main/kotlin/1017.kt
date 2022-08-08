fun main() {
    val time: Int = readLine()!!.toInt()
    val speed: Int = readLine()!!.toInt()
    val averageSpeed = time * speed
    val fuel = averageSpeed / 12
    val fuelFormat = ("%.3f".format(fuel))
    println(fuelFormat)
}
/*    val (a, b, c) = readLine()!!.split(' ').map(String::toDouble)
    val area1 = (a*c)/2
    val format1 = "%.3f".format(area1)
    val area2 = (c).pow(2) * 3.14159
    val format2 = "%.3f".format(area2)
    val area3 = (a + b) * c / 2
    val format3 = "%.3f".format(area3)
    val area4 = (b).pow(2)
    val format4 = "%.3f".format(area4)
    val area5 = a * b
    val format5 = "%.3f".format(area5)
    println("TRIANGULO: $format1")
    println("CIRCULO: $format2")
    println("TRAPEZIO: $format3")
    println("QUADRADO: $format4")
    println("RETANGULO: $format5")
    fun bee1002() {
    val raio: Double = readLine()!!.toDouble()
    val pi = 3.14159
    val area = pi * (raio).*/

/*    val (a, b, c) = readLine()!!.split(" ").map(String::toDouble)
    val delta = (b).pow(2) - (4 * a * c)
    if (delta < 0) {
        println("Impossivel calcular")
    }
    else if (a == 0.0){
        println("Impossivel calcular")
    } else {
        val x1 = (-b + sqrt( delta )) / (2 * a)
        val x1Format = "%.5f".format(x1)
        val x2 = (-b - sqrt( delta )) / (2 * a)
        val x2Format = "%.5f".format(x2)
        println("R1 = $x1Format")
        println("R2 = $x2Format")*/
