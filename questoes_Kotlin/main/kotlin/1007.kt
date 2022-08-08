fun main10092889() {
    val a: Int = readLine()!!.toInt()
    val b: Int = readLine()!!.toInt()
    val c: Int = readLine()!!.toInt()
    val d: Int = readLine()!!.toInt()
    val difference: Int = a * b - c * d
    println("DIFERENCA = $difference")
}

fun main1006() {
    val a: Double = readLine()!!.toDouble()
    val b: Double = readLine()!!.toDouble()
    val c: Double = readLine()!!.toDouble()
    val media = (a * 2 + b * 3 + c * 5) / 10
    val m = ("%.1f".format(media))
    println("MEDIA = $m")
}
fun main() {
    val time: Int = readLine()!!.toInt()
    val speed: Int = readLine()!!.toInt()
    val averageSpeed = time * speed
    val media = averageSpeed.toDouble()
    val fuel: Double = media/ 12
    println(String.format("%.3f", fuel))
}