/* Escribe un programa que calcule el salario semanal de un trabajador
teniendo en cuenta que las horas ordinarias (40 primeras horas de
trabajo) se pagan a $12 dólares la hora. A partir de la hora 41, se pagan a
16. El programa debe recibir como parámetro el total de horas trabajadas a
la semana. */

/*Nombre: Jose Luis Campos R.
grupo: 3T3-CO
Carnet:2021-0096U
Lab_Kotlin#2 de programacion grafica
Docente: GLENDA DEL SOCORRO BARRIOS AGUIRRE*/

fun main() {
    println("Ingrese las horas trabajadas a la semana: ")
    val horasTrabajadas = readLine()!!.toInt()
    var salario : Double
    if (horasTrabajadas <= 40) {
        salario = horasTrabajadas * 12.0 // Horas ordinarias
    } else {
        salario = 40 * 12.0 // Horas ordinarias
        salario += (horasTrabajadas - 40) * 16 // Horas extras
    }
    println("El salario semanal del trabajador es de \$$salario")
}