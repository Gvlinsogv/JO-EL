package ITB_07a_Arrays_I

/*
Abans de començar a fer exercicis d'arrays, comprovem que podem llegir i escriure bé en arrays
Entrada

El problema serà de tres línies. La primera tindrà un nombre, 𝐾
que et dirà el tamany de l'array que has de crear La segona son 𝐾 nombres, separats per espais que et dirà el contingut de l'array que has de llegir. La tercera serà 𝑁, una posició de l'array a on has d'accedir. Es garanteix que 𝑁<𝐾

.
Sortida

Tornaràs dues linies. La primera serà l'array sencer escrit, amb espais entre cada caràcter. La segona serà el contingut de l'array a la posició 𝑁

(recorda que la primera posició es 0).

 */

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val k = scan.nextInt() //tamany array
    val array = IntArray(k) //creem l'array
    for (i in 0 until k) {    //llegim l'array
        array[i] = scan.nextInt() //llegim cada element de l'array
    }
    val position = scan.nextInt() //llegim la posició
    for (j in 0 until k) { //escrivim l'array
        print("${array[j]} ") //escrivim cada element de l'array
    }
    println()//escrivim un salt de línia
    println(array[position]) //escrivim l'element de l'array a la posició indicada

}