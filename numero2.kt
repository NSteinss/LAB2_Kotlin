/* Cree una función en Kotlin para calcular el área de un círculo, la función debe
recibir como parámetro el radio y retornar el área calculada, el valor de PI debe
estar definido como una constante. Y el parámetro debe solicitarse al usuario,
además debe validarse el nulo con el operador elvis . Abajo un ejemplo de cómo
solicitar un parámetro. */

/*Nombre: Jose Luis Campos R.
grupo: 3T3-CO
Carnet:2021-0096U
Lab_Kotlin#2 de programacion grafica
Docente: GLENDA DEL SOCORRO BARRIOS AGUIRRE*/

fun main()
{
    println("El area de un circulo se medira en metros cuadrados")
    println("Ingrese el radio del circulo: ")
    val radio = readLine()?.toDouble() ?: 0.0
    println("The area of the circle is: ${areaCirculo(radio)} metros cuadrados")
}
fun areaCirculo(radio: Double): Double
{
    val PI = 3.1416
    return (PI * radio * radio)
}