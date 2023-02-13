fun main(){
    println("Ingrese su nombre")
    var nombre = readLine()!!.toString()

    println("INgrese la nota 1 ")
    var nota1 = readLine()!!.toDouble()

    println("INgrese la nota 2 ")
    var nota2 = readLine()!!.toDouble()

    println("INgrese la nota 3 ")
    var nota3 = readLine()!!.toDouble()

    var promedio = (nota1+nota2+nota3)/3

    if(promedio >= 3.5){
        println("Su nombre es $nombre y su promedio fue $promedio y GANO la materia")
    }else if(promedio >= 2){
        println("Su nombre $nombre y su promedio fue $promedio y puede recuperar la materia")
    }else{
        println("Su nombre es $nombre y su promedio fue $promedio y PERDIO la materia")
    }
}