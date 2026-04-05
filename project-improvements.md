# Project improvements

Based on analysis of the Cinema Room Manager code, here are practical improvement suggests:

**Code Quality & Architecture:**

1. **Extract Magic Numbers to Constants** – Ticket prices ($10/$8), menu options, and the 60-seat threshold are hardcoded. Move these to named constants at the top for easier maintenance.

2. **Pass Scanner as Parameter** – Currently, `buyTicket()` creates a new Scanner each time. Pass the scanner from `main()` to avoid redundant Scanner instantiation and for better separation of concerns.

3. **Consolidate Input Validation** – Create a reusable input validation function instead of repeating the bounds check logic.

**Features & User Experience:**

4. **Seat Cancellation** – Allow users to refund/cancel purchases (mark seat as 'S' again) and adjust statistics accordingly.

5. **Reservation System** – Distinguish between purchased ('B') and reserved ('R') seats, allowing holds without final payment.

6. **Booking History** – Track which seats were bought when and by whom (could store user names with purchases).

7. **Search Functionality** – Allow filtering by price point or viewing available seats in specific rows.

**Data Persistence:**

8. **Save/Load to File** – Persist cinema state to JSON or CSV so bookings survive program restarts (important for a real theater system).

**Enhanced Statistics:**

9. **Revenue by Price Tier** – Show how much came from premium vs. economy seats separately.

10. **Occupancy Visualization** – Maybe show a visual percentage bar in the statistics output.

**Testing & Documentation:**

11. **Expand Test Coverage** – Add edge case tests (full theater, single row, odd row counts).

12. **Add Code Comments** – Especially for the complex pricing logic and 0-based/1-based index conversions.