
/*Nombre: Jose Luis Campos R.
grupo: 3T3-CO
Carnet:2021-0096U
Lab_Kotlin#2 de programacion grafica
Docente: GLENDA DEL SOCORRO BARRIOS AGUIRRE*/

class Insecto(
    private val longitud: Float, // longitud del insecto (en cm)
    private val numAlas: Int, // número de alas del insecto
    private val numPatas: Int, // número de patas del insecto
    private val color: String, // color del insecto
    private val numAntenas: Int, // número de antenas del insecto
    private val tipoInsecto: String // tipo de insecto (por ejemplo, mariposa, abeja, hormiga, etc.)
) {
    // Función que imprime en pantalla los valores de los atributos de la clase
    fun imprimirAtributos() {
        println("Longitud: ${longitud} cm")
        println("Número de alas: ${numAlas}")
        println("Número de patas: ${numPatas}")
        println("Color: ${color}")
        println("Número de antenas: ${numAntenas}")
        println("Tipo de insecto: ${tipoInsecto}")
    }
}

// Creación de un objeto de la clase Insecto y especificación de sus valores
fun main() {
    val insecto = Insecto(2.3f, 2, 6, "negro", 2, "abeja")

    // Impresión de los valores de los atributos del objeto insecto
    insecto.imprimirAtributos()
}
