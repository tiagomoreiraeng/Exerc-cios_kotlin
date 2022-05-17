fun main(){

    // A partir do diâmetro, calcular área e perímetro!
    val PI = kotlin.math.PI
    println("Digite o diâmetro do círculo")
    var diametro = readLine()!!.toDouble()
    var area = (PI*diametro*diametro)/4
    var perimetro = PI*diametro
    println("A área do círculo é $area e o seu perímetro é $perimetro")
}