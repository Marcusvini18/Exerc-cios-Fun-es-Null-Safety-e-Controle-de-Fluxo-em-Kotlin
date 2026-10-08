fun verificarEntregar (enderecos: List<Strings?>){

    for (endereco in enderecos) {

        val enderecoFinal = endereco ?: "Endereço desconhecido"


        if (endereco == enderecoFinal) {
            println("Entrega cancelada: Falta de dados")
        } else {
            println("Calculando rota de entrega")
        }
    }
}