import java.util.*

fun main() {
    //O usuário digitará sua idade e o programa deverá printar o ano em que ele nasceu.

    print("Digite a sua idade: ")
    val idade = readLine()!!.toInt()

    val c = Calendar.getInstance()
    val anoAtual = c.get(Calendar.YEAR)

    println("O seu ano de nascimento é ${anoAtual - idade}")
}

