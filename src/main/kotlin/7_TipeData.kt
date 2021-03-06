// macam-macam tipe data di kotlin

// contoh tipe data bilangan bulat
fun main() {
    val minByte: Byte = -128
    val maxByte: Byte = 127 // 8bit
    val minShort: Short = -32768
    val maxShort: Short = 32767 // 16bit
    val minInt: Int = -2147483648
    val maxInt: Int = 2147483647 // 32bit
    val minLong: Long = -9223372036854775807
    val maxLong: Long = 9223372036854775807 // 64bit

    println("minByte: " + minByte)
    println("maxByte: " + maxByte)
    println("minShort: " + minShort)
    println("maxShort: " + maxShort)
    println("minInt: " + minInt)
    println("maxInt: " + maxInt)
    println("minLong: " + minLong)
    println("maxLong: " +maxLong)

// contoh tipe data bilangan decimal(floating-point)
    val maxFloat: Float = 9.123456789f
    val maxDouble: Double =  9.123456789

    println("maxFloat:" + maxFloat)
    println("maxDouble:" + maxDouble)

    // Untuk memberikan nilai sebagai float maka harus memberikan akhiran f atau F pada akhir literal.
}