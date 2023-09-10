fun main() {
    val pessoa1 = Pessoa()
    pessoa1.primeiroNome = "Gabriel"
    pessoa1.sobreNome = "Borges"
    pessoa1.idade = "29"
    pessoa1.altura = "1.69 metros"
    pessoa1.falar()

    val carroPessoa1 = Carro()
    carroPessoa1.marca = "Toyota"
    carroPessoa1.modelo = "Corola"
    carroPessoa1.cor = "Preto"
    carroPessoa1.tipo = "Sedan"
    carroPessoa1.falar()

    val casaPessoa1 = Casa()
    casaPessoa1.endereco = "Rua: FLor n° 9"
    casaPessoa1.cor = "Amarela"
    casaPessoa1.falar()

    //pessoa2
    val pessoa2 = Pessoa()
    pessoa2.primeiroNome = "Gabriela"
    pessoa2.sobreNome = "Borges"
    pessoa2.idade = "7"
    pessoa2.altura = "1.35 metros"
    pessoa2.falar()

    val carroPessoa2 = Carro()
    carroPessoa2.marca = "Honda"
    carroPessoa2.modelo = "Civic"
    carroPessoa2.cor = "Branco"
    carroPessoa2.tipo = "Sedan"
    carroPessoa2.falar()

    val casaPessoa2 = Casa()
    casaPessoa2.endereco = "Rua: FLor n° 9"
    casaPessoa2.cor = "Amarela"
    casaPessoa2.falar()

    println(pessoa1, carroPessoa1, casaPessoa1, pessoa2, carroPessoa2, casaPessoa2)


}
fun println(pessoa1: Pessoa, carroPessoa1: Carro, casaPessoa1: Casa,
            pessoa2: Pessoa, carroPessoa2: Carro, casaPessoa2: Casa) {



}
