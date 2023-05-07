// 1008 Salário

import java.util.*

fun main(args: Array<String>) {

	val reader = Scanner(System.`in`) 
	val x = reader.nextInt()
	val y = reader.nextInt()
	val z = reader.nextDouble()
	val salario = (y*z)
	println("NUMBER = %d".format(x))
	println("SALARY = U$ %.2f".format(salario))
}