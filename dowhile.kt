fun main(){
    println("Ingrese un numero")
    var numero = readLine()!!.toInt()

    var valorInicial = 1

    do{
        if(valorInicial%2==0){
            println(valorInicial)
        }
        valorInicial++
    }while(valorInicial<=numero)
}