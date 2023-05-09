// 1014 - Consumo

import java.util.*

fun main(args: Array<String>) {

	val dist = Scanner(System.`in`) 
	val a = dist.nextDouble()
	val b = dist.nextDouble()
	val m = a / b
	println("%.3f km/l".format(m))
}