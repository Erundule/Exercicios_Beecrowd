class Wordy {
    //interaçao 1
    fun answer(input: String):Int{
        //what is $?
        val expressao = input.substring(8, input.length - 1)
        val tokens = expressao.split("")
        var res = 0
        if (tokens.size > 1){
            when(tokens[1]){
                "plus" -> res = tokens[0].toInt() + tokens[2].toInt()
                "minus" -> res = tokens[0].toInt() - tokens[2].toInt()
                "multiplied" -> res = tokens[0].toInt() * tokens[3].toInt()
                "divided" -> res = tokens[0].toInt() / tokens[3].toInt()
            }
        }else{
            res = expressao.toInt()
        }
        return res
    }
}
fun main(){
    val w = Wordy()
    println(w.answer("What is 5?"))
    println(w.answer("What is 506 plus 10?"))
    println(w.answer("What is 506 multiplied by 10?"))
    println(w.answer("What is 506 divided by 10?"))
}