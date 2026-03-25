package lesson2

fun main() {
    val ageOfMajority = 19
    println("Введите ваш возраст:")
    val userAge = readln().toInt()
    val isAdult = userAge >= ageOfMajority
    println("Совершеннолетие достигнуто: $isAdult")
}