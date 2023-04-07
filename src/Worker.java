import java.sql.SQLOutput;
import java.util.HashMap;

public class Worker extends Thread {
    private ResultTable map;
    private TaskQueue queue;
    public Worker(ResultTable parameterMap, TaskQueue parameterQueue){
        map = parameterMap;
        queue = parameterQueue;

        while (!queue.isEmpty()){
            calculateDigit(queue.pop());
        }
    }

    public void calculateDigit(Integer i){
        if (i % 10 == 0){
            System.out.flush();
            System.out.print(".");
        }
        Bpp bppCaulator = new Bpp();
        int piValue = bppCaulator.getDecimal(i);
        if (Integer.toString(piValue).length() == 9){
            map.addElement(i,Integer.parseInt(Integer.toString(piValue).substring(0,1)));
        } else {
            map.addElement(i,0);
        }

    }
}
