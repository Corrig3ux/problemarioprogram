fun main() {
    val numeros = mutableListOf<Int>()

    // Ingresar 10 números
    repeat(10) {
        print("Ingrese el número ${it+1}: ")
        numeros.add(readLine()!!.toInt())
    }

    // Calcular la suma
    val suma = numeros.sum()

    // Calcular el promedio
    val promedio = suma.toDouble() / numeros.size

    // Imprimir resultados
    println("La suma de los números es: $suma")
    println("El promedio de los números es: $promedio")
}