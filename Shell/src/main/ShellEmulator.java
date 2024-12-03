package main;
import java.util.Scanner;
import utils.CommandExecutor;
public class ShellEmulator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String currentDir = System.getProperty("user.dir"); // Start with the current directory
        System.out.println("Welcome to the Basic Shell Emulator!");
        System.out.println("Type 'exit' to quit.\n");
        while (true) {
            System.out.print(currentDir + " > ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting Shell. Goodbye!");
                break;
            }
            try {
                currentDir = CommandExecutor.executeCommand(input, currentDir);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        scanner.close();
    }
}
