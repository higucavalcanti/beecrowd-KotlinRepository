// 1018 - Cédulas

import java.util.*


fun main(args: Array<String>) {

        val entrada = Scanner(System.`in`)
        val valor = entrada.nextInt()
        val cem = valor / 100
        val cinquenta = (valor % 100) / 50
        val vinte = ((valor % 100) % 50) / 20
        val dez = (((valor % 100) % 50) % 20) / 10
        val cinco = ((((valor % 100) % 50) % 20) % 10) / 5
        val dois = (((((valor % 100) % 50) % 20) % 10) % 5) / 2
        val um = ((((((valor % 100) % 50) % 20) % 10) % 5) % 2) / 1
        
        println(valor)
        println("%d nota(s) de R$ 100,00".format(cem))
        println("%d nota(s) de R$ 50,00".format(cinquenta))
        println("%d nota(s) de R$ 20,00".format(vinte))
        println("%d nota(s) de R$ 10,00".format(dez))
        println("%d nota(s) de R$ 5,00".format(cinco))
        println("%d nota(s) de R$ 2,00".format(dois))
        println("%d nota(s) de R$ 1,00".format(um))
}