// 1050 - DDD

import java.util.*

fun main(args: Array<String>) {

	val reader = Scanner(System.`in`)
	val DDD = reader.nextInt()
	
    if(DDD == 61){
        println("Brasilia")
    }else if(DDD == 71){
        println("Salvador")
    }else if(DDD == 11){
        println("Sao Paulo")
    }else if(DDD == 21){
        println("Rio de Janeiro")
    }else if(DDD == 32){
        println("Juiz de Fora")
    }else if(DDD == 19){
        println("Campinas")
    }else if(DDD == 27){
        println("Vitoria")
    }else if(DDD == 31){
        println("Belo Horizonte")
    }else{
        println("DDD nao cadastrado")
    }
}