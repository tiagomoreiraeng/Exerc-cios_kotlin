package EXERCICIOS_18_05_2022_LOOPING
fun main() {
//2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

    var numpar = 0
    var numimpar = 0

    for(i in 1..10){
        println("digite o número:")
        val num = readln().toInt()
        if (num % 2 == 0) {
            numpar++
        }else {numimpar ++}
    }
    println(" A quantidade de números pares é $numpar e a quantidade de números ímpares é $numimpar ")
}