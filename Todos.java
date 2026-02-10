import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Todos {
    List<TodoItem> items;

    public Todos() {
        this.items = new ArrayList<>();
    }

    public void add(String title){
        this.items.add(new TodoItem(title));
    }

    public void remove(int index){
        this.items.remove(index);
    }

    public void toogleCompleted(int index){
        this.items.get(index).toogleCompleted();
    }

    public List<String> itemsToString(){
        List<String> todoItems = new ArrayList<>();

         for(int i=0; i<items.size(); i++){
            String itemTitle = items.get(i).getTitle();
            String complete = items.get(i).getCompled() ? "Completed" : "Not Completed";

            String todoItem = String.format("%d - %s - %c", i + 1, itemTitle, complete);
            todoItems.add(todoItem);
        }

        return todoItems;
    }
}