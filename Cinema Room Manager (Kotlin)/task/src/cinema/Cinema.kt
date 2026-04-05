package cinema

fun main() {
    println("Enter the number of rows:")
    val rows = readln().toInt()
    println("Enter the number of seats in each row:")
    val seats = readln().toInt()

    val totalSeats = rows * seats
    val income = if (totalSeats <= 60) {
        totalSeats * 10
    } else {
        val half = rows / 2
        (half * seats * 10) + ((rows - half) * seats * 8)
    }

    println("Total income:")
    println("$${income}")
}