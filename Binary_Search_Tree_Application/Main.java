// Binary Search Tree Application - Eli G.

// **Hard coded inputs for display purposes**

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    // Print Alternative:
    public static void print(Object o) {
        System.out.println(o);
        //    Python "print()" vs "System.out.println()"
    }

    // Main:
    public static void main(String[] args) {
        String path = "DATA.txt";
        // Create new Tree:
            Binary_Search_Tree tree = new Binary_Search_Tree();
        // File stuff:
            try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                String line;
                while ((line = br.readLine()) != null) {
                   String[] data = line.split(", ");
                    String name = data[0];
                    int score = Integer.parseInt(data[1]);
                    String initials = data[2];
                    int plays = Integer.parseInt(data[3]);
                    tree.insert(new Player(name, score, initials, plays));
                }
            } 
            catch (IOException e) {
                e.printStackTrace();
            }

        // == Functions ==
        
        // Search:
        print("--Search--");
        String name = "Diana";
        Player finder = tree.search(name);
        if(finder != null){
            print("Found: " + finder); // or finder.name to just find name
        }
        else {
            print("Player Not Found");
        }
        print("");

        // Insertion / Add:
        print("--Add Player--");
        // ? Ex:
        Player player1 = new Player("Bruce ", 769, "BW", 5);
        tree.insert(player1); // or player.name for just name 
        if(player1 != null) {
            print("Added: " + player1);
        }
        print("");

        // Deleting:
        tree.delete("Natasha"); // just input name
        // returns null

        // Displaying:
        print("--Tree Display--");
        tree.display();
    }
}
