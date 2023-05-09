// 1015 - Distância Entre Dois Pontos

import java.util.*

fun main(args: Array<String>) {

	val ponto = Scanner(System.`in`)
	val a = ponto.nextDouble()
	val b = ponto.nextDouble()
	val c = ponto.nextDouble()
	val d = ponto.nextDouble()
	val x = ((c - a)* (c - a)) +((d -b)*(d - b))
	val y = Math.sqrt(x)
	 println("%.4f".format(y))
	
}