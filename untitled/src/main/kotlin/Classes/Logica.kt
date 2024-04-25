package Classes

class Logica {
    private var num1: Double = 1129.00
    private var num2: Double = 344.00
    private var num3: Double = 542.00
    private var num4: Double = 561.00

    private var resultado0 = num1 + num4
    private var resultado1 = num1 - num3
    private var resultado2 = num1 / num2
    private var resultado3 = num3 * num4
    private var resultado4 = num2 % num4

    fun adi (){
        println(resultado0)

    }
    fun sub (){
        println(resultado1)

    }
    fun mult (){
        println(resultado2)

    }
    fun divi (){
        println(resultado3)

    }
    fun rest(){
        println(resultado4)
    }

    override fun toString(): String {
        return ""
    }

}



