// 1011 - Esfera

import java.util.*

fun main(args: Array<String>) {

	val vol = Scanner(System.`in`) 
	val r = vol.nextDouble()
	val p = 3.14159
	val conta = (4/3.0) * (p * r * r * r)
	println("VOLUME = %.3f".format(conta))
	
}