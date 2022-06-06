import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todoList;

    public TodoList() {
        this.todoList = new ArrayList<>();
    }

    public void add(String exercise) {
        this.todoList.add(exercise);
    }

    public void remove(int taskIndex) {
        this.todoList.remove(taskIndex-1);
    }

    public void print() {
        for (int i = 0; i < this.todoList.size(); ++i) {
            System.out.println(String.format("%d: %s", i + 1, this.todoList.get(i)));
        }
    }
}
