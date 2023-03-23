/* Escribe un programa que ordene tres números enteros especificados como
parámetro a la función */

/*Nombre: Jose Luis Campos R.
grupo: 3T3-CO
Carnet:2021-0096U
Lab_Kotlin#2 de programacion grafica
Docente: GLENDA DEL SOCORRO BARRIOS AGUIRRE*/

fun main()
{
    println("Ingrese el primer numero: ")
    val numero1 = readLine()!!.toInt()
    println("Ingrese el segundo numero: ")
    val numero2 = readLine()!!.toInt()
    println("Ingrese el tercer numero: ")
    val numero3 = readLine()!!.toInt()
    println("Los numeros ordenados de menor a mayor son: ${ordenarNumeros(numero1, numero2, numero3)}")
}
fun ordenarNumeros(numero1: Int, numero2: Int, numero3: Int): String
{
    var numeros = arrayOf(numero1, numero2, numero3)
    numeros.sort()
    return numeros.joinToString()
}