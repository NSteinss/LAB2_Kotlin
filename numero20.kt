/*Nombre: Jose Luis Campos R.
grupo: 3T3-CO
Carnet:2021-0096U
Lab_Kotlin#2 de programacion grafica
Docente: GLENDA DEL SOCORRO BARRIOS AGUIRRE*/


import kotlin.math.PI

// Definimos la clase abstracta Figura
abstract class Figura(val nombre: String) {
    // Método abstracto para calcular el área de la figura
    abstract fun area(): Double
}

// Clase Triangulo que extiende de Figura
class Triangulo(val base: Double, val altura: Double) : Figura("TrianguloRectangulo") {
    // Implementación del método área para un triángulo
    override fun area(): Double = base * altura / 2
}

// Clase Cuadrado que extiende de Figura
class Cuadrado(val lado: Double) : Figura("Cuadrado") {
    // Implementación del método área para un cuadrado
    override fun area(): Double = lado * lado
}

// Clase Circulo que extiende de Figura
class Circulo(val radio: Double) : Figura("Circulo") {
    // Implementación del método área para un círculo
    override fun area(): Double = PI * radio * radio
}

// Clase Rectangulo que extiende de Figura
class Rectangulo(val base: Double, val altura: Double) : Figura("Rectangulo") {
    // Implementación del método área para un rectángulo
    override fun area(): Double = base * altura
}

fun main() {
    // Creamos las instancias de las figuras con los valores especificados
    val figura1 = Circulo(2.0)
    val figura2 = Rectangulo(1.0, 2.0)
    val figura3 = Cuadrado(3.0)
    val figura4 = Triangulo(3.0, 5.0)

    // Mostramos en pantalla el nombre y el área de cada figura
    println("${figura1.nombre}: Radio ${figura1.radio} Área ${figura1.area()}")
    println("${figura2.nombre}: Base ${figura2.base} Altura ${figura2.altura} Área ${figura2.area()}")
    println("${figura3.nombre}: Lado ${figura3.lado} Área ${figura3.area()}")
    println("${figura4.nombre}: Base ${figura4.base} Altura ${figura4.altura} Área ${figura4.area()}")
}
