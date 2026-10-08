fun validacaoBioInfantil(bio: String?){

    val tamanho= bio?.length?: 0

        if (bio<=50){
            println("Bio aceita")
        }else{
            println("A bio deve conter no máximo 50 caracteres")
        }
}

fun main(){
    validacaoBioInfantil("Eu gosto de desenhos...")
    validacaoBioInfantil(null)
    validacaoBioInfantil("A".repeat(51)))



}

