// 1037 - Intervalo

import java.util.*

fun main(args: Array<String>) {


val reader = Scanner(System.`in`)
val numero = reader.nextDouble()

    if (numero < 0 || numero > 100) 
        println("Fora de intervalo")

        else if (numero >= 0 && numero <= 25) 
        println("Intervalo [0,25]")

        else if (numero > 25 && numero <= 50) 
        println("Intervalo [25,50]")

        else if (numero > 50 && numero <= 25) 
        println("Intervalo [50,75]")
        

        else if (numero > 75 && numero <= 100) 
        println("Intervalo [75,100]")

}