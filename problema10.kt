fun main() {

    val alumnos = listOf(
        Alumno("Pérez", "Juan",  8.6 ),
        Alumno("González", "María", 9.5),
        // ... agregar los demás alumnos
    )


    alumnos.forEach { alumno ->
        println("Apellido: ${alumno.apellido}, Nombre: ${alumno.nombre}, Nota: ${alumno.nota}")
    }

    }

data class Alumno(val apellido: String, val nombre: String, val nota: Double)
