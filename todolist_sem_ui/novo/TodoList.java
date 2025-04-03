public class TodoList {
 private final int MAX_TASKS = 100;//FINAL SIGNIFICA QUE ELE É CON
 private Task [] tasks;
 private int count;
 private int nextId ;
 public TodoList(){
    this.tasks = new Task [MAX_TASKS];
    count = 0;
    nextId = 1;
    

 }
public void addTask(String description) {
if (count >= MAX_TASKS){
    System.out.println("Limite de tarefas atingido");
    return;
}
Task newTask = new Task (nextId, description);
this.tasks[this.count] = newTask;
this.count  = this.count +1;
this.nextId ++;
System.out.println("Tarefa adicionada:" + newTask);

}
public void removeTask(int id){
    boolean found = false;
    for (int i = 0; i < this.count; i++) {
        if (this.tasks[i].getId()==id){
            found =true;
            for (int j = i; j < count - 1; j++){
                tasks [j] = tasks [j+1];

            }
         tasks[count -1] = null;
         count--;
         System.out.println("Tarefa removida com id:" + id);
         break;


        }

    }
} 
  public void markTaskCompleted(int id){
    for (Task jTask: this.tasks){
        if(jTask==null){
            break;
        }
    } 
  }  
}
