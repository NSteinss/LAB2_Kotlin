/* Haciendo uso de lambdas, escriba una función que calcule la suma, el producto y
el promedio de tres números. */
/*Nombre: Jose Luis Campos R.
grupo: 3T3-CO
Carnet:2021-0096U
Lab_Kotlin#2 de programacion grafica
Docente: GLENDA DEL SOCORRO BARRIOS AGUIRRE*/
fun main() {
    var suma = {a: Int, b: Int, c: Int -> a + b + c}
    var producto = {a: Int, b: Int, c: Int -> a * b * c}
    var promedio = {a: Int, b: Int, c: Int -> (a + b + c) / 3}
    println("La suma de los numeros es: ${suma(1, 2, 3)}")
    println("El producto de los numeros es: ${producto(1, 2, 3)}")
    println("El promedio de los numeros es: ${promedio(1, 2, 3)}")
}