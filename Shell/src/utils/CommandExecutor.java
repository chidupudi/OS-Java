package utils;

import java.io.*;
import java.util.*;
public class CommandExecutor {
    public static String executeCommand(String command, String currentDir) throws IOException {
        String[] parts = command.split(" ");
        String cmd = parts[0];
        List<String> args = Arrays.asList(parts).subList(1, parts.length);
        switch (cmd) {
            case "ls":
                listFiles(currentDir);
                break;
            case "cd":
                return changeDirectory(args, currentDir);
            case "mkdir":
                createDirectory(args, currentDir);
                break;
            case "greet":
                greetCommand(args);
                break;
            default:
                executeSystemCommand(command, currentDir);
        }

        return currentDir; // Return the updated directory
    }

    private static void listFiles(String currentDir) {
        File dir = new File(currentDir);
        String[] files = dir.list();
        if (files != null) {
            for (String file : files) {
                System.out.println(file);
            }
        }
    }

    private static String changeDirectory(List<String> args, String currentDir) {
        if (args.isEmpty()) {
            System.out.println("Usage: cd <directory>");
            return currentDir;
        }

        String newPath = args.get(0);
        File newDir = new File(currentDir, newPath);

        if (newDir.exists() && newDir.isDirectory()) {
            return newDir.getAbsolutePath();
        } else {
            System.out.println("Directory not found: " + newPath);
            return currentDir;
        }
    }

    private static void createDirectory(List<String> args, String currentDir) {
        if (args.isEmpty()) {
            System.out.println("Usage: mkdir <directory>");
            return;
        }

        File newDir = new File(currentDir, args.get(0));
        if (newDir.mkdir()) {
            System.out.println("Directory created: " + newDir.getAbsolutePath());
        } else {
            System.out.println("Failed to create directory.");
        }
    }

    private static void greetCommand(List<String> args) {
        if (args.isEmpty()) {
            System.out.println("Hello!");
        } else {
            System.out.println("Hello, " + String.join(" ", args) + "!");
        }
    }

    private static void executeSystemCommand(String command, String currentDir) {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder();
            processBuilder.command("bash", "-c", command);
            processBuilder.directory(new File(currentDir));
            processBuilder.redirectErrorStream(true);

            Process process = processBuilder.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            process.waitFor();
        } catch (Exception e) {
            System.out.println("Command execution failed: " + e.getMessage());
        }
    }
}
