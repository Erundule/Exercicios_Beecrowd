fun main() {
    val time: Int = readLine()!!.toInt()
    val speed: Int = readLine()!!.toInt()
    val averageSpeed = time * speed
    val fuel = averageSpeed / 12
    val fuelFormat = ("%.3f".format(fuel))
    println(fuelFormat)
}

