// 1005 - Média 1

import java.util.*

fun main(args: Array<String>) {

	val reader = Scanner(System.`in`)
    val a = reader.nextDouble()
    val b = reader.nextDouble()
    val m = ((a * 3.5) + (b * 7.5)) / 11.0
    println("MEDIA = %.5f".format(m))

}