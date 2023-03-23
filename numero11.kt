/* Muestra la tabla de multiplicar de un número especificado como parámetro
 */
/*Nombre: Jose Luis Campos R.
grupo: 3T3-CO
Carnet:2021-0096U
Lab_Kotlin#2 de programacion grafica
Docente: GLENDA DEL SOCORRO BARRIOS AGUIRRE*/
fun main() {
    println("Ingrese el numero que desea multiplicar: ")
    val numero = readLine()!!.toInt()
    println("La tabla de multiplicar del numero $numero es: ")
    for (i in 1..10) {
        println("$numero x $i = ${numero * i}")
    }
}