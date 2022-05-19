package EXERCICIOS_19_05_2022

fun main(){
    var numero = 0
    do {
        numero+=1
        if (numero % 3 == 0 && numero % 5 == 0) {
            println("fizzbuzz)")
        } else if (numero % 3 == 0) {

            println("fizz")
        } else if (numero % 5 == 0) {

            println("buzz")
        } else {
            println(numero)
        }
    }
    while(numero in 1 .. 100)
}