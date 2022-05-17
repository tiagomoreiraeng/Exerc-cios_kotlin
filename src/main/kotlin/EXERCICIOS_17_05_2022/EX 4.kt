import kotlin.math.pow
import kotlin.math.sqrt

fun main(){
    // Faça um programa em que permita a entrada de um número qualquer e exiba se este
//número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
//ímpar exiba o número elevado ao quadrado.

    println("Por favor, digite o primeiro número.")
    print("Digite aqui: ")
    val num = readLine()!!.toDouble()

    if(num % 2 == 0.0) {
        println(
            "O número $num é par e sua rais quadrada é: ${
                "%.2f".format(sqrt(num))
            }"
        )
    }else{
        println("O número $num é impar e elevado ao quadrado é:"+
        "%.2f".format(num.pow(2)))
    }

}


