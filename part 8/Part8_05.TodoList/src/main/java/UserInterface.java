import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList todolist;

    public UserInterface(TodoList todolist, Scanner scanner) {
        this.scanner = scanner;
        this.todolist = todolist;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            executeCommand(command);
        }
    }

    public void executeCommand(String command) {
        if (command.equals("add")) {
            System.out.println("To add: ");
            String toAdd = scanner.nextLine();
            this.todolist.add(toAdd);
        } else if (command.equals("list")) {
            this.todolist.print();
        } else if (command.equals("remove")) {
            System.out.println("Which one is removed?");
            int toRemove = Integer.valueOf(scanner.nextLine());
            this.todolist.remove(toRemove);
        } else {
            System.out.println("Invalid command");
        }
    }
}
