// 1009 - Salário com Bônus

import java.util.*

fun main(args: Array<String>) {

val reader = Scanner(System.`in`)
val nome = reader.next()
val salario = reader.nextDouble()
val vendas = reader.nextDouble()
val total = (vendas*15)/100+salario

println("TOTAL = R$ %.2f".format(total))
}