/* Escriba un programa que, dado un array de números enteros, determine cuáles
son los elementos que se encuentran duplicados. */
/*Nombre: Jose Luis Campos R.
grupo: 3T3-CO
Carnet:2021-0096U
Lab_Kotlin#2 de programacion grafica
Docente: GLENDA DEL SOCORRO BARRIOS AGUIRRE*/

fun main() {
    val numeros = arrayOf(1, 2, 3, 4, 5, 6, 1, 3, 7, 8, 8)

    val duplicados = encontrarDuplicados(numeros)

    if (duplicados.isNotEmpty()) {
        println("Los elementos duplicados son: ")
        for (elemento in duplicados) {
            println(elemento)
        }
    } else {
        println("No hay elementos duplicados en el array")
    }
}

fun encontrarDuplicados(numeros: Array<Int>): Set<Int> {
    val duplicados = mutableSetOf<Int>()
    val unicos = mutableSetOf<Int>()

    for (numero in numeros) {
        if (!unicos.add(numero)) {
            duplicados.add(numero)
        }
    }

    return duplicados
}
