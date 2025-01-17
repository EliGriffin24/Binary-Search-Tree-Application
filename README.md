# Binary-Search-Tree-Application


# Binary Search Tree Player Management

This project is a Java application that uses a binary search tree to manage a collection of players. Each player has a name, score, initials, and number of plays. The application reads player data from a file, allows for the insertion and deletion of players, searches for players by name, and displays the entire tree.

## Project Structure

- `Main.java` - The main entry point of the application. It handles reading player data from a file, and provides a user interface for interacting with the binary search tree. ( Currently hardcoded inputs for display purposes )
- `Player.java` - Defines the `Player` class, which includes player attributes and a formatted `toString` method for aligned output.
- `Node.java` - Defines the `Node` class, which represents a node in the binary search tree.
- `BinTree.java` - Implements the binary search tree functionalities such as search, insert, delete, and display.

## Data File
Player data is taken from a `DATA.txt` file. Each line in this file represents a player, with fields separated by spaces. (optional display to output file )
