/* Escribe un programa que calcule el promedio y la suma de un arreglo de 10
números enteros. */
/*Nombre: Jose Luis Campos R.
grupo: 3T3-CO
Carnet:2021-0096U
Lab_Kotlin#2 de programacion grafica
Docente: GLENDA DEL SOCORRO BARRIOS AGUIRRE*/

fun main() {
    var arreglo = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var suma :Double = 0.0
    var promedio : Double
    for (i in arreglo) {
        suma += i
    }
    promedio = suma / arreglo.size
    println("La suma de los numeros es: $suma")
    println("El promedio de los numeros es: $promedio")
}