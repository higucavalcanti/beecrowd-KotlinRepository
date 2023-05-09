// 1036 - Fórmula de Bhaskara

import java.util.*

fun main(args: Array<String>) {

	val reader = Scanner(System.`in`)
	val A = reader.nextDouble()
	val B = reader.nextDouble()
	val C = reader.nextDouble()
	val D = "0"
	val zero = D.toDouble()
	
	if  ((A == zero) || (((B*B) -(4*A*C)) < 0)) {
	    println("Impossivel calcular")
	}
	
	else {
	    
	    val R1 = ((-B + Math.sqrt(((B*B) -(4*A*C)))) / (2*A))
	    val R2 = ((-B - Math.sqrt(((B*B) -(4*A*C)))) / (2*A))
	    println("R1 = %.5f".format(R1))
	    println("R2 = %.5f".format(R2))
	}
	
}