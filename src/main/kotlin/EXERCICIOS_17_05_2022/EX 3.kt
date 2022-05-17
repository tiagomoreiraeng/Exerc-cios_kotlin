fun main(){
    // 03) Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
    //categoria ela se encontra:
    // 10-14 infantil
    // 15-17 juvenil
    // 18-25 adulto

    println("Olá! Informe a sua idade")
    print("digite aqui: ")
    var idade = readLine()!!.toInt()

    /* Podemos resolver, usando o when e o if
    when(idade){
        in 10..14 -> println("Você está na categoria infantil")
        in 15..17 -> println("Você está na categoria juvenil")
        in 18..25 -> println("Você está na categoria adulto")
        else -> println("Você não está em nenhuma cadegoria")
    }
     */

    if (idade in 10..14 ) { println("Você está na categoria infantil") }
    else if (idade in 15..17 ) { println("Você está na categoria juvenil") }
    else if (idade in 18..25 ) { println("Você está na categoria adulto") }

}
