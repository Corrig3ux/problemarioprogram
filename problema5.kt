fun main(){
    val yearstrabajados = readln().toInt()
    var salary = readln().toInt()
    var porcentaje = 0

    if (yearstrabajados < 5){
        porcentaje = 0

    }
    else if(yearstrabajados >= 5){
        porcentaje = 0

    }
    val salrioacobrar = salary + ( salary * porcentaje)
    println( salrioacobrar)

}