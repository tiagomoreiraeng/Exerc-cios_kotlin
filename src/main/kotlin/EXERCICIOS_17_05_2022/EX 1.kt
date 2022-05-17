//Exercícios do dia 17_05_2020
fun main(){
    // 01) Faça um programa que receba três inteiros e diga qual deles é o maior.

    println("Olá! Vamos receber três valores e retornaremos o maior entre eles!")
    println("Por favor, digite o primeiro número.")
    print("Digite aqui: ")
    var n1 = readLine()!!.toInt()

    println("Por favor, digite o segundo número.")
    print("Digite aqui: ")
    var n2 = readLine()!!.toInt()

    println("Por favor, digite o terceiro número.")
    print("Digite aqui: ")
    var n3 = readLine()!!.toInt()

    var num_maior = n1

    // Salvei valor base N1 para comparar com N2 e N3

    if(num_maior>n2 && num_maior>n3){
        println("$n1 é o número maior!")}
    else if(num_maior<n2){
        num_maior=n2}
    if(num_maior<n3){
        num_maior=n3}

    println("O maior número é $num_maior")
}


