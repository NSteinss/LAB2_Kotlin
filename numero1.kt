/* Cree una función en Kotlin para calcular el área de un triángulo, la función debe
retornar el área y recibir como parámetro la base y la altura. Impleméntelo usando
variables de tipo val y funciones de conversión de entero a float. */

/*Nombre: Jose Luis Campos R.
grupo: 3T3-CO
Carnet:2021-0096U
Lab_Kotlin#2 de programacion grafica
Docente: GLENDA DEL SOCORRO BARRIOS AGUIRRE*/

fun main()
{
    println("El area de un triangulo se medira en metros cuadrados")
    println("Ingrese la base del triangulo: ")
    val base = readLine()!!.toInt()
    println("Ingrese la altura del triangulo: ")
    val altura = readLine()!!.toInt()
    println("The area of the triangle is: ${areaTriangulo(base, altura)} metros cuadrados")
}

fun areaTriangulo(base: Int, altura: Int): Int
{
    return (base * altura) / 2
}