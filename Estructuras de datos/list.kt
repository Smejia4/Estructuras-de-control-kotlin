fun main(){
    var lista: MutableList<String> = mutableListOf("Samuel", "Pablo", "Daniel", "Critian", "Alvaro", "Willer")
    
    //se cambio el nombre de Alvaro por Oscar 
    lista[4]= "Oscar"

    lista.forEach{recorrer ->
        println(recorrer)
    }
    // var lista: List<Int> = listOf(1,2,3,4,5,6)

    // println(lista[4])

    //se debe cambiar el tipo de lista a la siguiente manera 



    // println(lista)
    //Esta sirve para agregar varios valores al final de la lista 
    // lista.addAll(listOf(7,8,9,10))

    // println(lista)
    // Elimina el primer elemento de la lista que coincida con el elemento dado.
    // lista.remove(10)
    // println(lista)
}