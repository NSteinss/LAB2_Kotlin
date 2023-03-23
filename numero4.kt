/* Haciendo uso de los Strings y los caracteres de tabulación escriba un
programa que muestre en pantalla 10 palabras en inglés con su respectiva
traducción en español, deben estar distribuidas en dos columnas y
alineadas a la izquierda. Pruebe con los caracteres de tabulación */

/*Nombre: Jose Luis Campos R.
grupo: 3T3-CO
Carnet:2021-0096U
Lab_Kotlin#2 de programacion grafica
Docente: GLENDA DEL SOCORRO BARRIOS AGUIRRE*/

fun main() {
    val palabras =
            mapOf(
                    "hello" to "hola",
                    "goodbye" to "adiós",
                    "yes" to "si",
                    "no" to "no",
                    "please" to "por favor",
                    "thanks" to "gracias",
                    "sorry" to "lo siento",
                    "cheap" to "Barato",
                    "help" to "ayuda",
                    "happy" to "feliz"
            )
    for ((key, value) in palabras) {
        println("$key\t\t||\t\t$value")
    }
}
