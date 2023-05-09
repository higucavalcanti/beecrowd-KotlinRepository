// 1041 - Coordenadas de um Ponto

import java.util.*

fun main(args: Array<String>) {
val reader = Scanner(System.`in`)

val x = reader.nextDouble()
val y = reader.nextDouble()

        if (x == 0.0 && y == 0.0) 
            println("Origem")
        else if (x == 0.0) 
            println("Eixo Y")
        else if (y == 0.0) 
            println("Eixo X")
        else if (y > 0 && x > 0) 
            println("Q1")
        else if (y > 0 && x < 0)
            println("Q2")
        else if (y < 0 && x < 0)
            println("Q3")
        else if (y < 0 && x > 0) 
            println("Q4")
        }