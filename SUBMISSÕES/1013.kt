// 1013 - O Maior

import java.util.*

fun main(args: Array<String>) {

val reader = Scanner(System.`in`)
val valor1 = reader.nextInt()
val valor2 = reader.nextInt()
val valor3 = reader.nextInt()


 if (valor1 > valor2 && valor1 > valor3) 
        	println("$valor1 eh o maior")
         else if (valor2 > valor3) 
        	println("$valor2 eh o maior")
         else 
        	println("$valor3 eh o maior")
}