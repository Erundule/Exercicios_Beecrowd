enum class Signal{
    WINK, DOUBLE_BLINK, JUMP, CLOSE_YOUR_EYES
    }
fun getEnumValue(v:Int):Signal {
    val res = when (v) {
        0 -> Signal.WINK
        1 -> Signal.DOUBLE_BLINK
        2 -> Signal.CLOSE_YOUR_EYES
        else -> Signal.JUMP
    }
    return res
}
object HandshakeCalculator{
    fun calculateHandshake(number: Int): List<Signal> {
        val bin = number.toString(2).reversed()
        val res = mutableListOf<Signal>()

        var cont = 0
        while (cont < bin.length) {
            val bit = bin[cont]
            if (bit == '1') {
                if (cont == 0) {
                    res.add(Signal.WINK)
                } else if (cont == 1) {
                    res.add(Signal.DOUBLE_BLINK)
                } else if (cont == 2) {
                    res.add(Signal.CLOSE_YOUR_EYES)
                } else if (cont == 3) {
                    res.add(Signal.JUMP)
                } else {
                    res.reverse()
                }
            }
            cont++
        }
        return res
    }
}
         
