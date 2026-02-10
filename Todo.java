
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Todo {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        List<TodoItem> items = new ArrayList<>();

        while(true) {
            System.out.print("Chose one option from the menu below ny emtering the option number");
            System.out.print("1. Add");
            System.out.print("2. Delete");
            System.out.print("3. Toogle complete");
            System.out.print("4. List my todos");


            int option = scanner.nextInt();

            switch(option) {
                case 1:
                    System.out.print("Enter what yo want to add");
                    String title = scanner.nextLine();
                    items.add(new TodoItem(title));
                    String message = String.format(title, "Successfully added");
                    System.out.print(message);
                case 2:
                    System.out.print("Enter the number of the todo item you want to delete");
                    for(int i=0; i<items.size(); i++){
                        String itemTitle = items.get(i).getTitle();

                        String itemOptionSting = String.format("%d $s", i, itemTitle);
                        System.out.print(itemOptionSting);
                    }

                    System.out.print("Are you sure you want to delete this? Yes/No");
                    String deletePromptChoice = scanner.nextLine();

                    if ("yes".equals(deletePromptChoice.toLowerCase())) {
                        int userChoise = scanner.nextInt();
                        items.remove(userChoise);
                        System.out.print("Item successdully removed");
                    } else {
                        System.out.print("No item is deleted");
                    }
                case 3:
                    System.out.print("Enter what you want to toogle complete");
                    for(int i=0; i<items.size(); i++){
                        String itemTitle = items.get(i).getTitle();

                        String itemOptionSting = String.format("%d $s", i, itemTitle);
                        System.out.print(itemOptionSting);
                    }
                    

                    int userChoice = scanner.nextInt();
                    TodoItem chosenItem = items.get(userChoice);

                    chosenItem.toogleCompleted();
                    if (chosenItem.getCompled()) {
                        System.out.print("Item successdully toogled to complete");
                    } else {
                        System.out.print("Item successdully toogled to incomplete");
                    }
                case 4:
                    for(int i=0; i<items.size(); i++){
                        String itemTitle = items.get(i).getTitle();

                        String itemOptionSting = String.format("%d $s", i, itemTitle);
                        System.out.print(itemOptionSting);
                    }
                default:
                    System.out.print("Enter what you want to toogle complete");
            }
        }
    }
}