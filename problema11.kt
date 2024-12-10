fun main() {
    repeat(10) {
        print("Ingrese un valor: ")
        val valor = readLine()?.toIntOrNull() ?: 0

        when {
            valor < 10 -> println("El valor es menor que 10")
            valor in 10..100 -> println("El valor está entre 10 y 100")
            else -> println("El valor es mayor que 100")
        }
    }
}