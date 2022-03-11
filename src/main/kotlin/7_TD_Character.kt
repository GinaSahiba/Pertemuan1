//Karakter di Kotlin ditandai dengan memberikan single quotes pada nilai sebuah variabel.

fun main(args: Array<String>) {
    var charA : Char = 'A'
    //println(charA == 65)

    //kode program penggunaan fungsi anggota dari Character
    println(charA.isUpperCase())
    println(charA.isLowerCase())
    println(charA.isDigit())
    println(charA.toLowerCase())
    val strA: String = charA.toString()
    println("Kini charA sudah menjadi String = "+strA)

}