/* Escribe un programa que lea un número n e imprima una pirámide de números con n filas */
/*Nombre: Jose Luis Campos R.
grupo: 3T3-CO
Carnet:2021-0096U
Lab_Kotlin#2 de programacion grafica
Docente: GLENDA DEL SOCORRO BARRIOS AGUIRRE*/

fun main() {
    print("Ingrese un número: ")
    val n = readLine()!!.toInt()

    var num = 1
    for (i in 1..n) {
        for (j in 1..n - i) {
            print("  ")
        }
        for (j in 1..i) {
            print("$num   ")
            num++
        }
        println()
    }
}
