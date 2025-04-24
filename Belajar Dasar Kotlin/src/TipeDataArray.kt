fun main() {
    
    // Tipe Data Array
    val members: Array<String> = arrayOf("Audyari", "Wiyono", "Budi")
    val values: Array<Byte> = arrayOf(100, 90, 95)
    val balances: Array<Int> = arrayOf(10_060, 20_608, 30_080)

    //Operasi Array
    val eko: String = members[0]
    val joko: String = members[1]
    val budi: String = members[2]

    members[0] = "Amar"
    val amar: String = members[0]

    println(eko)
    println(joko)
    println(budi)
    println(amar)
    println(members[0])

    // Array Nullable
    val nullableMembers: Array<String?> = arrayOf("Audyari", "Wiyono", "Budi")
    nullableMembers[0] = null
    println(nullableMembers[0])
}