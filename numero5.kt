/* Haciendo uso de las sentencias de control condicionales escriba un
programa que pida una hora por teclado y que muestre como resultado
Buenos días, Buenas tardes o Buenas noches, según la hora. Tome en
cuenta que de 06 a 12 es mañana, de las 13 a las 20 es tarde y fuera de los
rangos anteriores, noche. */

/*Nombre: Jose Luis Campos R.
grupo: 3T3-CO
Carnet:2021-0096U
Lab_Kotlin#2 de programacion grafica
Docente: GLENDA DEL SOCORRO BARRIOS AGUIRRE*/

fun main() {
    println("Ingrese la hora: ")
    val hora = readLine()!!.toInt()
    when (hora) {
        in 6..12 -> println("Buenos días")
        in 13..20 -> println("Buenas tardes")
        else -> println("Buenas noches")
    }
}