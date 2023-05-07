// 1012 - Área

import java.util.*

fun main(args: Array<String>) {
val reader = Scanner(System.`in`)
val a = reader.nextDouble()
val b = reader.nextDouble()
val c = reader.nextDouble()
val triangulo = a * c / 2.0
val quadrado = b * b
val circulo = 3.14159 * (c * c)
val trapezio = ((a + b) * c) / 2
val retangulo = a * b

        println("TRIANGULO: %.3f".format(triangulo))
        println("CIRCULO: %.3f".format(circulo))
        println("TRAPEZIO: %.3f".format(trapezio))
        println("QUADRADO: %.3f".format(quadrado))
        println("RETANGULO: %.3f".format(retangulo))  
}