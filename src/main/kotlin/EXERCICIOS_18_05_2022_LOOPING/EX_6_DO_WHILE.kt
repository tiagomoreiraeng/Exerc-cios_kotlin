fun main() {

    //Escrever um programa que receba vários números inteiros no teclado. E no
    //final imprimir a média dos números múltiplos de 3. Para sair digitar
    //0(zero).(DO...WHILE)

    var soma = 0.0
    var cont = 0
    do {
        print("Digite um número")
        val numero = readln().toInt()

        if (numero % 3 == 0 && numero != 0) {

            soma += numero
            cont++
        }

    } while (numero != 0)
    val media = soma / cont

    println("A soma dos múltiplos de 3 é $soma e a média é $media")
}
