/* Escribe un programa que calcule el salario semanal de un colaborador en
base a las horas trabajadas, a razón de $12 la hora. En la medida de lo
posible haga uso de los métodos asociados a la variable. */

/*Nombre: Jose Luis Campos R.
grupo: 3T3-CO
Carnet:2021-0096U
Lab_Kotlin#2 de programacion grafica
Docente: GLENDA DEL SOCORRO BARRIOS AGUIRRE*/

fun main()
{
    println("El salario semanal de un colaborador se medira en dolares")
    println("Ingrese las horas trabajadas: ")
    val horas = readLine()!!.toInt()
    println("El salario semanal del colaborador es: ${salarioSemanal(horas)} dolares")
}
fun salarioSemanal(horas: Int): Int
{
    val salario = 12
    return (horas * salario)
}