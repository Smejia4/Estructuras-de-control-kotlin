fun main(){
    println("Ingrese la cantidad")
    var cantidad = readLine()!!.toInt()
    for(i in 1..cantidad){
        println("INgrese un numero")
        var numero = readLine()!!.toInt()
        if(numero%11 == 0){
            println("El numero $numero es divisible entre 11")
        }else{
            println("El numero $numero no es divisible entre 11")
        }
    }
}