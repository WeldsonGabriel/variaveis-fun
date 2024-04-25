package Classes

class Carro {
    var marca = "null"
    var modelo = "null"
    var cor= "null"
    var tipo = "null"


    fun falar (){

        println("Esse é Meu carro, um $marca $modelo da cor $cor ele é um $tipo")

    }

    override fun toString(): String {
        return "Classes.Carro(marca='$marca', modelo='$modelo', cor='$cor', tipo='$tipo')"
    }
}
