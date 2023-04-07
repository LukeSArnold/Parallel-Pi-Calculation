import java.util.ArrayList;
import java.util.LinkedList;
public class TaskQueue {
    LinkedList<Integer> queue;
    public TaskQueue() {
        ArrayList<Integer> tempArray = new ArrayList<Integer>();
        for (int i = 0; i < 1001;i++){
            tempArray.add(i);
        }
        java.util.Collections.shuffle(tempArray);
        queue = new LinkedList<Integer>(tempArray);
    }
    public Integer pop(){
        return queue.pop();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }
}

