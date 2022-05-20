package EXERCICIOS_20_05_2022_ARRAYS

// Crie um programa para trabalhar com estoque de uma loja, o programa deverá
//trabalhar com Collection do tipo List do Kotlin para manipular os dados desse estoque, o
//programa deverá atender as seguintes funcionalidades:

//CONTROLE DE ESTOQUE
//ADICIONAR, LISTAR, ALTERAR, PRODUTOS
//Armazenar dados da List
//Remover dados da list;
//Atualizar dados da list.
//Apresentar todos os dados da list.

fun main(){

    val lista_produtos = mutableListOf<String>()

    while (true) {

        println("Seja bem vindo ao sistema de vendas da ORACLE! \n"
                + "O que deseja fazer? \n" +
                "1 - INSERIR PRODUTO \n" +
                "2 - REMOVER PRODUTO \n" +
                "3 - ATUALIZAR PRODUTO \n" +
                "4 - APRESENTAR LISTA DE PRODUTOS DO ESTOQUE \n")
                "5 - SAIR DO PROGRAMA"

        print("digite aqui: ")
        val opcao = readln().toInt()



        when (opcao) {
            1 -> {
                println("Digite o nome do produto")
                val novo_produto = readln().toString()
                if (novo_produto != "") {
                    lista_produtos.add(novo_produto)
                    println("O produto $novo_produto foi adicionado! \n " +
                            "A lista atual do estoque é :$lista_produtos")
                } else {
                    println("opção inválida")
                }
            }

            2 -> {
                println("Digite o nome do produto que deseja remover")
                val produto_a_remover = readln().toString()
                if (lista_produtos.contains(produto_a_remover)) {
                    lista_produtos.remove(produto_a_remover)
                    println("Produto removido!")
                } else {
                    println("O produto não existe na lista!")
                }
            }

            3 -> {
                println("LISTA DE PRODUTOS")
                lista_produtos.forEach {
                    println(it)
                }
                println("\n digite o nome do produto que deseja editar")
                val produto_a_editar = readln().toString()

                if (lista_produtos.contains(produto_a_editar)) {
                    val index = lista_produtos.indexOf(produto_a_editar)

                    println("Digite o nome atualizado do produto.")
                    val produto_atualizado = readLine().toString()

                    lista_produtos[index] = produto_atualizado
                    println("O produto foi atualizado!")
                } else {
                    println("O produto informado não consta na lista do estoque")
                }
            }

            4 -> {
                println("LISTA DE PRODUTOS NO ESTOQUE\n")

                println("LISTA DE PRODUTOS")
                lista_produtos.forEach {
                    println(it)
                }
            }

            5 -> break
        }
    }

}

