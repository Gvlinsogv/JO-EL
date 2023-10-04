/*Et proposem un petit repte. Donat un número enter positiu N, suma per separat els números parells i els números senars entre 1 i N (inclós).
Entrada:
L'entrada consta d'un primer número K que indica els casos de prova a tractar. Per cada cas de prova l'entrada serà un número enter positiu.
Sortida

Es mostrarà un missatge indicant la suma dels nombres parells i la suma dels senars. El missatge tindrà el següent format:
 */

import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val casos = scanner.nextInt()
    var sumaParells = 0
    var sumaSenars = 0

    for (i in 1..casos) { //per cada cas de prova
        val num = scanner.nextInt() //llegim el número
        if (num % 2 == 0) sumaParells += num //si el número és parell, sumem el número a la suma de parells
        else sumaSenars += num //si el número és senar, sumem el número a la suma de senars
    }
    println("SUMA PARELLS: $sumaParells SUMA SENARS: $sumaSenars") //imprimim la suma de parells i la suma de senars
}