package Classes

class Pessoa  {
    var primeiroNome = "null"
    var sobreNome = "null"
    var idade:String? = "null"
    var altura:String? = "null"

    fun falar (){

        println("Olá eu sou $primeiroNome $sobreNome, tenho $idade anos de idade e $altura de altura")
    }

    override fun toString(): String {
        return "Classes.Pessoa(primeiroNome='$primeiroNome', sobreNome='$sobreNome', idade=$idade, altura=$altura)"
    }
}
