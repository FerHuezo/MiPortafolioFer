package fernando.ramirez.portafoliofer

class parImpar {
    fun vefParImpar(numero: Int): String {
        return if (numero % 2 == 0) {
            "El número $numero es par."
        } else {
            "El número $numero es impar."
        }
    }
}