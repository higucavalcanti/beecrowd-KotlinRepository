// 1006 - Média 2

import java.util.*

fun main(args: Array<String>) {

	val reader = Scanner(System.`in`)
    val a = reader.nextDouble()
    val b = reader.nextDouble()
    val c = reader.nextDouble()
    val m = ((a * 2) + (b * 3) + (c * 5)) / 10.0
    println("MEDIA = %.1f".format(m))

}