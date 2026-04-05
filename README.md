# Cinema Room Manager (Kotlin)

## Description

This project is a console-based Cinema Room Manager application written in Kotlin. It allows users to manage a cinema room by:
- Viewing the current seating arrangement.
- Purchasing tickets with dynamic pricing based on the room size and seat location.
- Viewing statistics, including the number of purchased tickets, capacity percentage, current income, and total potential income.

The application handles input validation and dynamically updates the seating state as tickets are purchased.

## Motivation

This project was developed to practice console-based application development in Kotlin, focusing on multi-dimensional arrays, loops, conditional logic, input processing, and basic statistics calculations.

## Stack & Requirements

- **Language:** Kotlin
- **Build System:** Gradle
- **JDK:** 17 or higher (recommended)

## Getting Started

### Prerequisites

Ensure you have the Java Development Kit (JDK) installed on your system.

### Installation

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd "Cinema Room Manager (Kotlin)"
   ```
2. Open the project in an IDE that supports Kotlin (e.g., IntelliJ IDEA).

### Running the Application

You can run the `Cinema.kt` file directly from your IDE, which is located in `Cinema Room Manager (Kotlin)/task/src/cinema/Cinema.kt`.

Alternatively, use the Gradle wrapper from the command line:

```bash
./gradlew run
```

*Note: On Windows, use `gradlew.bat run`.*

## Scripts & Commands

- `./gradlew build`: Compiles the project and runs tests.
- `./gradlew run`: Executes the main application.
- `./gradlew test`: Runs the automated test suite.
- `./gradlew clean`: Deletes the build directory.

## Tests

The project includes tests powered by the `hs-test` framework. To run tests:

```bash
./gradlew test
```

## Project Structure

```text
.
├── Cinema Room Manager (Kotlin)
│   ├── task
│   │   ├── src/cinema/Cinema.kt        # Main entry point
│   │   └── test/                       # Project tests
│   └── ... (stage-specific task files)
├── build.gradle                   # Gradle build configuration
├── settings.gradle                # Gradle project settings
└── ...
```

## Environment Variables

No specific environment variables are required for this project.

## Code of Conduct

Please review our [CODE_OF_CONDUCT.md](CODE_OF_CONDUCT.md) for expected behavior.

## Contributing

Please see our [CONTRIBUTING.md](CONTRIBUTING.md) for details on how to contribute to this project.

## Contributor

Mateusz Piotrowski

## License

MIT

## Badges

![Build Status](https://img.shields.io/badge/build-passing-brightgreen)
![License](https://img.shields.io/badge/license-MIT-blue)
