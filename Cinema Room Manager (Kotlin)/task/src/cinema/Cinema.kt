package cinema

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Enter the number of rows:")
    val nRows = scanner.nextInt()
    println("Enter the number of seats in each row:")
    val nSeats = scanner.nextInt()
    println()

    val cinema = Array(nRows) { CharArray(nSeats) { 'S' } }

    while (true) {
        println("1. Show the seats")
        println("2. Buy a ticket")
        println("0. Exit")

        when (scanner.nextInt()) {
            1 -> printCinema(cinema, nRows, nSeats)
            2 -> buyTicket(cinema, nRows, nSeats)
            0 -> return
        }
    }
}

fun printCinema(cinema: Array<CharArray>, nRows: Int, nSeats: Int) {
    println()
    println("Cinema:")
    print("  ")
    repeat(nSeats) { print("${it + 1} ") }
    println()
    repeat(nRows) { row ->
        print("${row + 1} ")
        repeat(nSeats) { col ->
            print("${cinema[row][col]} ")
        }
        println()
    }
    println()
}

fun buyTicket(cinema: Array<CharArray>, nRows: Int, nSeats: Int) {
    val scanner = Scanner(System.`in`)

    println()
    println("Enter a row number:")
    val row = scanner.nextInt() - 1
    println("Enter a seat number in that row:")
    val col = scanner.nextInt() - 1

    val totalSeats = nRows * nSeats
    val price = if (totalSeats <= 60) {
        10
    } else {
        val half = nRows / 2
        if (row < half) 10 else 8
    }

    println()
    println("Ticket price: $$price")

    cinema[row][col] = 'B'
}