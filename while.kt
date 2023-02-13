fun main(){
    var numero:Int
    var continuar = "si"

    while(continuar.uppercase() == "SI"){
        println("Ingrese un numero")
        numero = readLine()!!.toInt()
        if(numero < 0){
            numero = numero * -1
        }
        println("El numero posistivo es $numero")

        println("¿Desea ingresar otro numero? (si/no)")

        continuar = readLine()!!
    }
}