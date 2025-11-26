# Number Guessing Game

A simple command-line number guessing game built in Java.

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

## Description

This is a classic number guessing game where the computer generates a random number between 1 and 100, and the player tries to guess it within 10 attempts. The game provides hints ("Too HIGH" or "Too LOW") after each guess.

## Features

- Random number generation (1-100)
- 10 attempts per game
- Input validation
- Play again option
- Game statistics tracking (wins, games played, win rate)
- User-friendly interface

## How to Play

1. The computer picks a random number between 1 and 100
2. Enter your guess
3. The game tells you if your guess is too high or too low
4. Keep guessing until you find the number or run out of attempts
5. Try to beat your high score!

## How to Run

### Prerequisites
- Java JDK 8 or higher installed

### Steps
```bash
# Clone the repository
git clone https://github.com/eng-neelpatel/java-number-guessing-game.git

# Navigate to the directory
cd java-number-guessing-game

# Compile the game
javac NumberGuessingGame.java

# Run the game
java NumberGuessingGame
```

## Sample Output

```
====================================
   WELCOME TO NUMBER GUESSING GAME
====================================

I'm thinking of a number between 1 and 100
You have 10 attempts to guess it!

Attempt 1/10 - Enter your guess: 50
Too LOW! Try a higher number.

Attempt 2/10 - Enter your guess: 75
Too HIGH! Try a lower number.

Attempt 3/10 - Enter your guess: 63

*** CONGRATULATIONS! ***
You guessed the number 63 in 3 attempts!
```

## Author

**Neel Patel** - [@eng-neelpatel](https://github.com/eng-neelpatel)

## License

This project is open source and available for learning purposes.
