fun main() {
    /*Faça um programa em que o usuário digite o diâmetro de um
     círculo e calcule a área e o perímetro dele
     */

    print("Digite o diametro do circulo: ")
    val diametro = readLine()!!.toDouble()
    val area = 3.14 * ((diametro / 2) * (diametro / 2))
    val perimetro = 3.14 * 2 * (diametro / 2)

    println("Para o diametro $diametro a area do circulo é $area e o perimetro $perimetro")
}