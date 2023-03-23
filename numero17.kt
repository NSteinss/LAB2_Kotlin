/* Escriba un programa que determine si dos números son amigos. Dos números
enteros positivos se consideran amigos si la suma de los divisores de uno es igual
al otro número y viceversa. Por ejemplo, los números 220 y 284 son amigos. Los
divisores del número 220 son: 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110, y suman 284.
Los divisores de 284 son: 1, 2, 4, 71 y 142, que suman 220. */
/*Nombre: Jose Luis Campos R.
grupo: 3T3-CO
Carnet:2021-0096U
Lab_Kotlin#2 de programacion grafica
Docente: GLENDA DEL SOCORRO BARRIOS AGUIRRE*/
fun main() {
    print("Ingrese el primer número: ")
    val num1 = readLine()!!.toInt()

    print("Ingrese el segundo número: ")
    val num2 = readLine()!!.toInt()

    if (esAmigo(num1, num2)) {
        println("$num1 y $num2 son números amigos")
    } else {
        println("$num1 y $num2 no son números amigos")
    }
}

fun esAmigo(num1: Int, num2: Int): Boolean {
    return sumarDivisores(num1) == num2 && sumarDivisores(num2) == num1
}

fun sumarDivisores(num: Int): Int {
    var suma = 0
    for (i in 1 until num) {
        if (num % i == 0) {
            suma += i
        }
    }
    return suma
}
