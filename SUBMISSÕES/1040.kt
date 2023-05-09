// 1040 - Média 3

import java.util.*

fun main(args: Array<String>) {
    val (a, b, c, d)= readLine()!!.split(" ").map(String::toFloat)
    val media= (((a * 2) + (b * 3) + (c * 4) + (d * 1)) / (2 + 3 + 4 + 1))
    val mediaFormat = "%.1f".format(media)
        if (media >= 7){
            println("Media: $mediaFormat")
            println("Aluno aprovado.")
        }
        else if (media < 5){
            println("Media: $mediaFormat")
            println("Aluno reprovado.")
        }
        else if (media >= 5 && media <= 6){
            println("Media: $mediaFormat")
            println("Aluno em exame.")

    val notaExame: Float = readLine()!!.toFloat()
    val notaExameFormat = "%.1f".format(notaExame)
        println("Nota do exame: $notaExameFormat")
            
    val mediaFinal= ((media + notaExame)/2)
    val mediaFinalFormat = "%.1f".format(mediaFinal)
        if (mediaFinal >= 5){
                println("Aluno aprovado.")
                println("Media final: $mediaFinalFormat")
            }
            else if (mediaFinal < 4.9){
                println("Aluno reprovado")
                println("Media final: $mediaFinalFormat")
            }
        }
}