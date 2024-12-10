fun main(){
    var suma = 0

    for(i in 1..100){
        println("ingresa el numero $i:")
        val numero = readLine()!!.toInt()?:0
        suma += numero
    }

    print("la suma total es: $suma")




}