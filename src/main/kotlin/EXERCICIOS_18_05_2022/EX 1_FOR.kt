fun main(){

    //enquanto
   // while(condição){código}

      //  do{bloco de código que vai ser executado ao menos uma vez}while(condição)

    //    for(i in 10..20){codigo enquanto range não é finalizado}
// for(i in 10..20 step 2) para pular de dois em dois
   //  for(i in 10 downTo 1)
    //EX_1- Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)

    for(i in 1000..1999){
        if (i % 11 == 5){
            println(i)
        }}
}


