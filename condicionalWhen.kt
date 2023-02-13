fun main(){
    println("INgrese un numero del 1 al 7 cada uno corresponde a un dia de la semana")
    var numero = readLine()!!.toInt()

    when(numero){
        6,7 -> println("Fin de semana")
        in 1..5 -> println("Entre semana")
        else -> println("NUmero invalido")
    }
}