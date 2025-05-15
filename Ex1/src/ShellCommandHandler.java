import java.io.File;
import java.io.IOException;

public class ShellCommandHandler {
    private File currentDirectory;

    public ShellCommandHandler() {
        this.currentDirectory = new File(System.getProperty("user.dir"));
    }

    public void printWorkingDirectory() {
        System.out.println(currentDirectory.getAbsolutePath());
    }

    public void listDirectory() {
        File[] files = currentDirectory.listFiles();
        if (files != null) {
            for (File file : files) {
                System.out.println((file.isDirectory() ? "[DIR] " : "      ") + file.getName());
            }
        }
    }

    public void changeDirectory(String name) {
        File newDir = new File(currentDirectory, name);
        if (newDir.exists() && newDir.isDirectory()) {
            currentDirectory = newDir;
        } else {
            System.out.println("Directory not found.");
        }
    }

    public void makeDirectory(String name) {
        File newDir = new File(currentDirectory, name);
        if (newDir.mkdir()) {
            System.out.println("Directory created.");
        } else {
            System.out.println("Failed to create directory.");
        }
    }

    public void createFile(String name) {
        File newFile = new File(currentDirectory, name);
        try {
            if (newFile.createNewFile()) {
                System.out.println("File created.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error creating file.");
        }
    }

    public void printHelp() {
        System.out.println("Available commands:");
        System.out.println("pwd          - Print working directory");
        System.out.println("ls           - List directory contents");
        System.out.println("cd <dir>     - Change directory");
        System.out.println("mkdir <name> - Create a directory");
        System.out.println("touch <name> - Create a file");
        System.out.println("help         - Show this help message");
        System.out.println("exit         - Exit shell");
    }

    public File getCurrentDirectory() {
        return currentDirectory;
    }
}