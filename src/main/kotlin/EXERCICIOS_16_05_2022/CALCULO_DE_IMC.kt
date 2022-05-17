fun main(){

    var nome: String
    var peso: Float
    var altura: Float
    var imc: Float
    var imc2: Float

    println("Olá seja bem vindo ao sistema de Cálculo de IMC! \n"+
                " Por favor digite o seu nome!")
    nome = readln()!!.toString()

    println("Agora " + nome + " por favor, digite seu peso em Kg!")
    peso = readln()!!.toFloat()

    println("Qual a sua altura em metros?")
    altura = readln()!!.toFloat()

    imc = (peso/(altura*altura))

    if(imc<=18.5) {
        println(nome + " Cuidado seu IMC é " + imc + " e está na faixa de magreza, procure um especialista")
    }else if(imc<=24.9){
        println(nome + " Fique tranquilo seu IMC é "+ imc + " e está na faixa normal")
    }else if(imc<=29.9){
        println(nome + " cuidado seu IMC é " + imc + " e está na faixa de sobrepeso, procure um especialista")
    }else if(imc<=39.9){
        println(nome + " cuidado seu IMC é "+ imc +" e está na faixa de obesidade, procure um especialista")
    }else if(imc>40){
        println(nome+ " cuidado seu IMC é " + imc +" e está na faixa de obesidade grave, procure um especialista")
    } }