/*Nombre: Jose Luis Campos R.
grupo: 3T3-CO
Carnet:2021-0096U
Lab_Kotlin#2 de programacion grafica
Docente: GLENDA DEL SOCORRO BARRIOS AGUIRRE*/


data class Clase(
    val profesor: String,
    val materia: String,
    val laboratorios: Int,
    val conferencias: Int
)

// Crear una instancia de la clase
val clase = Clase("Juan Perez", "Matemáticas", 2, 3)

fun main(){
    // Imprimir los resultados en pantalla
    println(clase.profesor)
    println(clase.materia)
    println(clase.laboratorios)
    println(clase.conferencias)
}
