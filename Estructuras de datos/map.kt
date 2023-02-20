fun main(){
    //creacion de un mapa mutable
    val edades = mutableMapOf(
    "Daniel" to 18,
    "Cristofert" to 19,
    "Luisa" to 20,
    "Cristian" to 17,
    "Sara" to 16
    )

    for ((name, age) in edades) {
        println("Nombre: $name - Edad: $age")
    }
    // println(edades["Daniel"])
    
    // edades["Cristian"]= 21
    // println(edades["Cristian"])



    //este sirve para obtener un valor a partir de su clave 
    // val valor = edades.get("Cristofert")

    // println(valor)
}