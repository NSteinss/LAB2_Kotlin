/* Escribe un programa que dado un número del 1 a 7 escriba el
correspondiente nombre del día de la semana. */

/*Nombre: Jose Luis Campos R.
grupo: 3T3-CO
Carnet:2021-0096U
Lab_Kotlin#2 de programacion grafica
Docente: GLENDA DEL SOCORRO BARRIOS AGUIRRE*/

fun main()
{
    println("Ingrese un numero del 1 al 7: ")
    val numero = readLine()!!.toInt()
    when (numero) {
        1 -> println("Lunes")
        2 -> println("Martes")
        3 -> println("Miercoles")
        4 -> println("Jueves")
        5 -> println("Viernes")
        6 -> println("Sabado")
        7 -> println("Domingo")
        else -> println("El numero ingresado no es valido")
    }
}