fun main(){
    var suma = 0
    var valor: Int

    do {
        print("ingrese un valor (o 0 para terminar:)")
        valor = readLine()!!.toInt()
        suma += valor
    }
    while(suma <= 78500)

    println("la suma total es: $suma")


}