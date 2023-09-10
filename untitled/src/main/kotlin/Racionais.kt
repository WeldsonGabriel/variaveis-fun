class Racionais{
    private var num1:Int  = 1120
    private var num2:Int  = 344
    private var num3:Int  = 542
    private var num4:Int  = 561

    var logico0:Boolean = num2 > num4
    var logico1:Boolean = num2 < num4
    var logico2:Boolean = num3 == num4
    var logico3:Boolean = num4 != num2

    fun maior (){
        println(logico0)

    }
    fun menor (){
        println(logico1)

    }
    fun igual (){
        println(logico2)

    }
    fun diferente (){
        println(logico3)

    }


    override fun toString(): String {
        return ""
    }
}