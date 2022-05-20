
fun main(){
    // 01) Faça um programa que receba três inteiros e organize em ordem crescente.

    println("Olá! Vamos receber três valores e retornaremos em ordem crescente!")
    println("Por favor, digite o primeiro número.")
    print("Digite aqui: ")
    var n1 = readLine()!!.toInt()

    println("Por favor, digite o segundo número.")
    print("Digite aqui: ")
    var n2 = readLine()!!.toInt()

    println("Por favor, digite o terceiro número.")
    print("Digite aqui: ")
    var n3 = readLine()!!.toInt()

    if(n1 <= n2 && n2 <= n3) {println("$n1 - $n2 - $n3")}
    else if(n1 <= n3 && n3 <= n2) {println("$n1 - $n3 - $n2")}
    else if(n2 <= n1 && n1 <= n3) {println("$n2 - $n1 - $n3")}
    else if(n2 <= n3 && n3 <= n1) {println("$n2 - $n1 - $n3")}
    else if(n2 <= n3 && n3 <= n1) {println("$n2 - $n3 - $n1")}
    else if(n3 <= n1 && n1 <= n2) {println("$n3 - $n1 - $n2")}
    else {println("$n3 - $n2 - $n1")}
}
