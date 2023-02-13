fun main(){
    println("Ingrese su nombre")
    var nombre = readLine()!!.toString()

    println("Ingrese la nota 1")
    var nota1 = readLine()!!.toDouble()

    println("Ingrese la nota 2")
    var nota2 = readLine()!!.toDouble()

    println("Ingrese la nota 3")
    var nota3 = readLine()!!.toDouble()

    var promedio = (nota1+nota2+nota3)/3

    if(promedio >= 3.5){
        println("Su nombre es $nombre y su promedio es $promedio y gano la materia")
    }
}