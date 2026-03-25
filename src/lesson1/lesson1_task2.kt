package lesson1

fun main(){
        val applePrice = 50
        val appleAmount = 10
        var totalPrice = applePrice * appleAmount

        totalPrice += (totalPrice * 0.05).toInt()
        println(totalPrice)

}