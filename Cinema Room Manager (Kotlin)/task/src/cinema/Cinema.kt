package cinema

fun main() {
    println("Cinema:")
    print("  ")
    for (i in 1..8) {
        print("$i ")
    }
    println()

    for (row in 1..7) {
        print("$row ")
        for (seat in 1..8) {
            print("S ")
        }
        println()
    }
}