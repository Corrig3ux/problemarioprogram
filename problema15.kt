fun main() {
    val scanner = java.util.Scanner(System.`in`)

    var countA = 0
    var countB = 0
    var countC = 0
    var countD = 0
    var countE = 0

    for (i in 1..100) {
        println("Ingresa un valor:")
        val valor = scanner.nextInt()

        when {
            valor > 0 && valor < 10 -> countA++
            valor in 10..100 -> countB++
            valor > 100 -> countC++
            valor < 0 -> countD++
            valor == 0 -> countE++
        }
    }

    println("Resultados:")
    println("a) Valores mayores a 0 y menores a 10: $countA")
    println("b) Valores comprendidos entre 10 y 100 (inclusive): $countB")
    println("c) Valores mayores a 100: $countC")
    println("d) Valores negativos: $countD")
    println("e) Valores iguales a 0: $countE")
}