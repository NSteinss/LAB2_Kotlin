/*Nombre: Jose Luis Campos R.
grupo: 3T3-CO
Carnet:2021-0096U
Lab_Kotlin#2 de programacion grafica
Docente: GLENDA DEL SOCORRO BARRIOS AGUIRRE*/


class Persona {
    var nombres:String = ""
    var apellidos:String = ""
    var cedula:String = ""
    var sexo:String = ""
    var añoNacimiento:Int = 0

    constructor(nombres:String,apellidos:String,cedula:String,sexo:String,añoNacimiento:Int){
        this.nombres = nombres
        this.apellidos = apellidos
        this.cedula = cedula
        this.sexo = sexo
        this.añoNacimiento = añoNacimiento
    }
}

fun main(){
    var persona = Persona("Camilo","Perez","001-00000-000U","De vez en cuando",1990)
    println("Nombre: ${persona.nombres} sexo: ${persona.sexo}")
}