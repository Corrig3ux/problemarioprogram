fun main() {
    val scanner = java.util.Scanner(System.`in`)
    var sum = 0
    var count = 0

    for (i in 1..10) {
        println("Ingresa un valor numérico:")
        val valor = scanner.nextInt()

        if (valor in 5..2500) {
            sum += valor
            count++
        }
    }

    if (count > 0) {
        val promedio = sum.toDouble() / count
        println("El promedio de los valores comprendidos entre 5 y 2500 es: $promedio")
    } else {
        println("No se ingresaron valores en el rango especificado.")
    }
}