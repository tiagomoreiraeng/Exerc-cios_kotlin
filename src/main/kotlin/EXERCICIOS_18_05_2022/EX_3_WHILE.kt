
fun main() {

    //EX_3-Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
    //Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)

    var idade21 = 0
    var idade50 = 0
    var idade = 0


        while (idade != -99) {
            println("olá! Digite a idade do usuário!")
            idade = readLine()!!.toInt()
            if (idade == -99) {
                println("programa finalizado!")
            } else if (idade < 21) {
                idade21++
            } else if (idade > 50) {
                idade50++
            }

        }
    println("A quantidade de pessoas com menos de 21 é: $idade21")
    println("A quantidade de pessoas com mais de 50 é: $idade50")
}

