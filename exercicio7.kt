fun limparEmails(emails: List<String?>) {
    var contasInvalidas = 0

    for (email in emails) {
        if (email == null || (email?.length ?: 0) == 0) {
            contasInvalidas++
            println("Conta inválida: deleção necessária")
        } else {
            println("Conta válida: $email")
        }
    }

    println("Total de contas que precisam ser apagadas: $contasInvalidas")
}

fun main() {
    val emails = listOf(
        "ana@email.com",
        null,
        "",
        "joao@email.com",
        null,
        "maria@email.com"
    )

    limparEmails(emails)
}