// 1007 - Diferença

import java.util.*

fun main(args: Array<String>) {

	val menos = Scanner(System.`in`)
    val h = menos.nextInt()
    val j = menos.nextInt()
    val k = menos.nextInt()
    val l = menos.nextInt()
    val s = (h*j-k*l)
    println("DIFERENCA = %d".format(s))

}