package lesson3

fun main() {
    val password = "123"
    var input: String

    do {
        println("Введи пароль:")
        input= readln()
        if (input != password) println("Не верно!")
    } while (input != password)

    println("Молодец! Проходи)")
}