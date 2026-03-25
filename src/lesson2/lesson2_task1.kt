package lesson2

fun main() {
    val ageOfMajority = 19
    println("Введите ваш возраст:")
    val userAge = readln().toInt()
    val message = if (userAge >= ageOfMajority) {
        "добро пожаловать"
    } else {
        "вход запрещен, подрастите еще"
    }
    println(message)

}