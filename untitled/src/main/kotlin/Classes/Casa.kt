package Classes

class Casa  {
    var endereco:String? = "null"
    var cor ="null"
    fun falar (){

        println("Meu endereço é $endereco a cor da minha casa é $cor")

    }

    override fun toString(): String {
        return "Classes.Casa(endereco=$endereco, cor='$cor')"
    }
}
