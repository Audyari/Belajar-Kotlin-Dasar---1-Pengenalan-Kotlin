fun main() {

    // Label
    LoopI@ for (i in 1..10) {
        LoopJ@ for (j in 1..10) {
            println("$i x $j = ${i * j}")
        }
    }

    // Break to Label
    LoopI@ for (i in 1..10) {
        LoopJ@ for (j in 1..10) {
            println("$i x $j = ${i * j}")
            if (j == 10) {
                break@LoopI
            }
        }
    }

    // Continue to Label
    LoopI@ for (i in 1..10) {
        LoopJ@ for (j in 1..10) {
            println("$i x $j = ${i * j}")
            if (i == 1) {
                continue@LoopI
            }
        }
    }

    // Return to Label
    fun test(name: String, param: (String) -> Unit): Unit = param(name)
    test("Audy") testLabel@{
        if (it == "Audy") {
            return@testLabel
        }
        println("Ini tidak akan tampil jika it == 'Audy'")
    }
    println("Audy")

}


    