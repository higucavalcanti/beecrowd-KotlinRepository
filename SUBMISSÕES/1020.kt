// 1020 - Idade em Dias

import java.util.*

fun main(args: Array<String>) {
    var dias = readLine()!!.toInt()
    var f = 1
    var ano = 0
    var mes = 0
    while (f == 1){
        if (dias >= 365) {
            ano = dias / 365
            dias -= ano * 365
        } else {
            if (dias >= 30) {
                mes = dias / 30
                dias -= mes * 30
            } else { 
                f = 0
            }
    }
}
println("$ano ano(s)")
println("$mes mes(es)")
println("$dias dia(s)")
}