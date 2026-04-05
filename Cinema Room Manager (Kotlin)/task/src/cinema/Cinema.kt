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
        println("3. Statistics")
        println("0. Exit")

        when (scanner.nextInt()) {
            1 -> printCinema(cinema, nRows, nSeats)
            2 -> buyTicket(cinema, nRows, nSeats)
            3 -> printStats(cinema, nRows, nSeats)
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
        repeat(nSeats) { col -> print("${cinema[row][col]} ") }
        println()
    }
    println()
}

fun buyTicket(cinema: Array<CharArray>, nRows: Int, nSeats: Int) {
    val scanner = Scanner(System.`in`)
    while (true) {
        println()
        println("Enter a row number:")
        val row = scanner.nextInt()
        println("Enter a seat number in that row:")
        val col = scanner.nextInt()

        if (row < 1 || row > nRows || col < 1 || col > nSeats) {
            println("Wrong input!")
            continue
        }

        val row0 = row - 1
        val col0 = col - 1
        if (cinema[row0][col0] == 'B') {
            println("That ticket has already been purchased!")
            continue
        }

        val totalSeats = nRows * nSeats
        val price = if (totalSeats <= 60) 10 else if (row0 < nRows / 2) 10 else 8

        println()
        println("Ticket price: $$price")
        cinema[row0][col0] = 'B'
        break
    }
}

fun printStats(cinema: Array<CharArray>, nRows: Int, nSeats: Int) {
    val totalSeats = nRows * nSeats
    val purchased = cinema.sumOf { row -> row.count { it == 'B' } }
    var currentIncome = 0
    for (r in 0 until nRows) {
        for (c in 0 until nSeats) {
            if (cinema[r][c] == 'B') {
                currentIncome += if (totalSeats <= 60) 10 else if (r < nRows / 2) 10 else 8
            }
        }
    }
    val totalIncome = if (totalSeats <= 60) totalSeats * 10 else {
        val half = nRows / 2
        half * nSeats * 10 + (nRows - half) * nSeats * 8
    }
    val percentage = if (totalSeats == 0) 0.0 else (purchased * 100.0 / totalSeats)

    println()
    println("Number of purchased tickets: $purchased")
    println("Percentage: %.2f%%".format(percentage))
    println("Current income: $$currentIncome")
    println("Total income: $$totalIncome")
    println()
}