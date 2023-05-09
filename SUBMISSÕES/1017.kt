// 1017 - Gasto de Combustível

import java.util.*

fun main(args: Array<String>) {

	val arquivo = Scanner(System.`in`)
    val a = arquivo.nextInt()
    val b = arquivo.nextInt()
    val x = a * b
    val y = x / 12.0;
	
	println("%.3f".format(y))
}