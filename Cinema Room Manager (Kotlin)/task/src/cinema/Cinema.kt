package cinema

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Enter the number of rows:")
    val rows = scanner.nextInt()
    println("Enter the number of seats in each row:")
    val seatsInRow = scanner.nextInt()

    println()

    // Print initial cinema
    println("Cinema:")
    print("  ")
    for (col in 1..seatsInRow) print("$col ")
    println()
    for (row in 1..rows) {
        print("$row ")
        for (col in 1..seatsInRow) print("S ")
        println()
    }

    println()

    println("Enter a row number:")
    val selectedRow = scanner.nextInt()
    println("Enter a seat number in that row:")
    val selectedCol = scanner.nextInt()

    // Calculate price
    val totalSeats = rows * seatsInRow
    val price = if (totalSeats <= 60) {
        10
    } else {
        val half = rows / 2
        if (selectedRow <= half) 10 else 8
    }

    println()
    println("Ticket price: $$price")
    println()

    // Print updated cinema with B
    println("Cinema:")
    print("  ")
    for (col in 1..seatsInRow) print("$col ")
    println()
    for (row in 1..rows) {
        print("$row ")
        for (col in 1..seatsInRow) {
            if (row == selectedRow && col == selectedCol) {
                print("B ")
            } else {
                print("S ")
            }
        }
        println()
    }
}