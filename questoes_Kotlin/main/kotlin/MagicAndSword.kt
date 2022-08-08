import kotlin.math.abs
import kotlin.math.sqrt

class MagiaDano() {
    fun dano(magia: String): Int {

        val condicao = when (magia) {
            "fire" -> {
                200
            }
            "water" -> {
                300
            }
            "earth" -> {
                400
            }
            "air" -> {
                100
            }
            else -> {
                0
            }
        }
        return condicao
    }

    fun raio(magia: String, nivel: Int): Int {
        val condicao2 = when {
            (magia == "fire") && (nivel == 1) -> 20
            (magia == "fire") && (nivel == 2) -> 30
            (magia == "fire") && (nivel == 3) -> 50
            (magia == "water") && (nivel == 1) -> 10
            (magia == "water") && (nivel == 2) -> 25
            (magia == "water") && (nivel == 3) -> 40
            (magia == "earth") && (nivel == 1) -> 25
            (magia == "earth") && (nivel == 2) -> 55
            (magia == "earth") && (nivel == 3) -> 70
            (magia == "air") && (nivel == 1) -> 18
            (magia == "air") && (nivel == 2) -> 38
            (magia == "air") && (nivel == 3) -> 60
            else -> {
                0
            }
        }
        return condicao2
    }
    fun res() {
        val entrada = readLine()!!.toInt()
        for (i in 1..entrada) {
            val (w, h, x0, y0) = readLine()!!.split(' ').map(String::toInt)
            val (magic, n, cx1, cy1) = readLine()!!.split(' ')
            val nivel = n.toInt()
            val cx = cx1.toInt()
            val cy = cy1.toInt()
            var proc = true
            val a = x0 + w
            val b = y0 + h
            if ((cx in x0..a) && (cy in y0..b)) {
                proc = false
            }
            if (proc) {
                val c1 = (y0 - cy) * (y0 - cy)
                val c2 = (b - cy) * (b - cy)
                for (x in x0..a) {
                    val d1 = sqrt(((x - cx) * (x - cx) + c1).toDouble())
                    val d2 = sqrt(((x - cx) * (x - cx) + c2).toDouble())
                    if (raio(magic, nivel) >= d1 || raio(magic, nivel) >= d2)
                        proc = false
                }
            }
            if (proc) {
                val c3 = (x0 - cx) * (x0 - cx)
                val c4 = (x0 + w - cx) * (x0 + w - cx)
                for (y in y0..y0 + h) {
                    val d3 = sqrt((c3 + (y - cy) * (y - cy)).toDouble())
                    val d4 = sqrt((c4 + (y - cy) * (y - cy)).toDouble())
                    if (raio(magic, nivel) >= d3 || raio(magic, nivel) >= d4) {
                        proc = false
                    }
                }
            }
            if (proc) {
                println(0)
            } else {
                println(dano(magic))
            }
        }
    }
}
fun main(args: Array<String>){
    MagiaDano().res()
}
    /*
    fun alcance(cx: Int, cy: Int, raio: Int, x: Int, y: Int, largura: Int, altura: Int): Boolean {
        val cDx = abs(cx - (x + largura / 2))
        val cDy = abs(cy - (y + altura / 2))
        val a = cDx - largura/2
        val b = cDy - altura/2
        return if ((cDx > (largura / 2 + raio)) || (cDy > (altura / 2 + raio))){
            false
        } else if((cDx <= largura / 2) || (cDy <= altura / 2)){
            true
        }else{
            ((a*a) + (b*b) <= (raio*raio))
        }
    }

        }
    }
}
fun main(){
    MagiaDano().res()
}

     */



