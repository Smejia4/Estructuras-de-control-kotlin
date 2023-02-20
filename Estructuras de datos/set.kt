fun main(){
    //conjunto mutable
    val conjunto = mutableSetOf("Daniel","Samuel","Pablo","Cristofert","Juan")

    if(conjunto.contains("Camilo")){
        println("El conjunto contiene Camilo")
    }else{
        println("El conjunto no contiene Camilo")
    }

    for(recorrer in conjunto){
        println(recorrer)
    }
    // accediendo al primer elemento del conjunto
    // val primerElemento = conjunto.first()

    // println(primerElemento)

    // // Agregar elementos al conjunto mutable
    // conjunto.add("Cristofert")//agregando un elemento
    // conjunto.addAll(listOf("Camilo", "Yuliam"))//agregando varios elementos



    // //esta sirve para saber la cantidad de elementos que hay en un conjunto   
    // var cantidadcon = conjunto.size;
    // println(cantidadcon)
}