♟️ Online Chess Game with AI (Java)

An Online Chess Game with AI developed in Java using Object-Oriented Programming principles.
The system supports player vs player and player vs AI gameplay, with an intelligent AI opponent powered by the Minimax algorithm with Alpha-Beta pruning.

🚀 Features

Online / Multiplayer chess support (extendable using sockets)

AI opponent using Minimax + Alpha-Beta pruning

Valid chess move enforcement

Game state management (turns, captures)

Undo / Redo functionality

Interactive board visualization (Swing-based)

Modular and scalable design

🛠️ Technologies Used

Java

Java Swing (GUI)

OOP Concepts

Data Structures

2D Arrays (Board)

Stack (Undo / Redo)

Tree (AI decision-making)

Minimax Algorithm

Alpha-Beta Pruning

📂 Project Structure
ChessGame/
└── src/
    └── chess/
        ├── Main.java
        ├── Game.java
        ├── Board.java
        ├── Move.java
        ├── Player.java
        ├── AIPlayer.java
        ├── Piece.java
        ├── Pawn.java
        ├── Rook.java
        ├── Knight.java
        ├── Bishop.java
        ├── Queen.java
        ├── King.java
        ├── Color.java
        └── ChessSwingUI.java

🤖 AI Implementation

Uses Minimax Algorithm to evaluate possible game states

Alpha-Beta pruning optimizes performance by eliminating unnecessary branches

AI selects the best move based on board evaluation score

▶️ How to Run

Clone or download the repository

Open the project in IntelliJ / Eclipse / VS Code

Run Main.java

The Swing-based Chess UI window will open

Play against the AI or another player

🧠 Key OOP Concepts Used

Inheritance: Piece hierarchy (Pawn, Rook, etc.)

Polymorphism: Move validation logic

Encapsulation: Game state and board control

Abstraction: AI decision logic

💼 Resume Description

Developed an Online Chess Game in Java with an AI opponent using Minimax and Alpha-Beta pruning, implementing OOP principles, move validation, undo/redo functionality, and an interactive Swing-based UI.

🔮 Future Enhancements

Full online multiplayer using Socket Programming

Chess timers

Advanced board evaluation

Player ranking system

Database-backed match history

Mobile or web version

📜 License

This project is developed for educational and learning purposes.
