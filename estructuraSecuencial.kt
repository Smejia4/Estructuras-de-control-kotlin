fun main(){
    println("Ingrese su nombre")
    var nombre:String = readLine()!!.toString()

    println("Ingrese la nota 1")
    var nota1:Double = readLine()!!.toDouble()

    println("Ingrese la nota 2")
    var nota2:Double = readLine()!!.toDouble()

    println("Ingrese la nota 3")
    var nota3:Double = readLine()!!.toDouble()

    var promedio = (nota1+nota2+nota3)/3

    println("Su nombre es $nombre y su promedio es $promedio")

}