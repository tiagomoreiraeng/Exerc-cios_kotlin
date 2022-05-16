fun main() {

    /*Primeiro vamos declarar nossas variáveis
    FLOAT - 2,5 arredonda
    DOUBLE - 2,55 (ocupa mais espaço mas não arredonda)
    CHAR - Único caractere
    STRING - Texto
    BOOLEAN - sim ou não

    OPERADORES LÓGICOS
    E = "&&"
    OU = ||

    FUNÇÕES
    QUANDO - when {
                 variável > 0 -> {println("isso") }
                 variavel < 0 -> {println("isso") }
                 else { println("isso") }
                            ou
             when (variável){
                    1 -> println("janeiro")
                    2 -> println("fevereiro")
                    else -> println("inválido")
                             OU
             when (variavel){
                    isso,ou isso,ou isso -> println("isso")
                    else {println("isso")

             readline()!!.to int()

    */

    var pesoTomate = 0.0f
    val limite: Float = 50f
    var multa: Float = 4.0f
    var multaTotal: Float = 0.0f

    // Por que algumas ficam azuis e outras não?

    println("Digite o peso de tomates em Kg")
    pesoTomate = readln()!!.toFloat()
    if (pesoTomate > limite) {
        multaTotal = (pesoTomate - limite) * multa
        println("Há excesso de peso \n Multa no valor de"+ multaTotal)
    } else {
        println("Peso ok, sem multas!")
    }
}