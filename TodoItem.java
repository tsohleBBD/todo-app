public class TodoItem{
    private String title;
    private boolean completed;

    public TodoItem(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    
    public boolean getCompled(){
        return  completed;
    }

    public void toogleCompleted() {
        this.completed = !this.completed;
    }
}