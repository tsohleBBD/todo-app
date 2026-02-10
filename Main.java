import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Todos todos = new Todos();

        List<String> stringTodos = new ArrayList<String>();

        outer:
        while(true) {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Chose one option from the menu below ny emtering the option number");
            System.out.println("1. Add");
            System.out.println("2. Delete");
            System.out.println("3. Toogle complete");
            System.out.println("4. List my todos");
            System.out.println("5. Exit app");


            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Enter title of todo");
                    String title = scanner.nextLine();

                    todos.add(title);

                    String message = String.format(title, "Successfully added");
                    System.out.println(message);
                    break;

                case 2:
                    System.out.println("Enter the number of the todo item you want to delete");
                    stringTodos = todos.itemsToString();

                    int userDeleteChoice = scanner.nextInt();

                    for(int i=0; i < stringTodos.size(); i++){
                        System.out.println(stringTodos.get(i));
                    }

                    System.out.println("Are you sure you want to delete this? Yes/No");
                    String deletePromptChoice = scanner.nextLine();

                    if ("yes".equals(deletePromptChoice.toLowerCase())) {
                        todos.remove(userDeleteChoice);
                        System.out.println("Item successdully removed");
                    } else {
                        System.out.println("No item is deleted");
                    }
                    break;

                case 3:
                    System.out.println("Enter the number of the item you want to toogle complete");

                    int userToogleChoice = scanner.nextInt();
                    todos.toogleCompleted(userToogleChoice);

                    if (todos.items.get(userToogleChoice).getCompled()) {
                        System.out.println("Item successfully toogled to complete");
                    } else {
                        System.out.println("Item successfully toogled to incomplete");
                    }
                    break;
                
                case 4:
                    stringTodos = todos.itemsToString();

                    for(int i=0; i < stringTodos.size(); i++){
                        System.out.println(stringTodos.get(i));
                    };
                    break;

                case 5:
                    break outer;

                default:
                    System.out.println("Enter what you want to toogle complete");
            }
        }
    }
}