import java.util.HashMap;
public class ResultTable{
    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    public ResultTable(){

    }
    public HashMap<Integer,Integer> getMap(){
        return map;
    }

    public void addElement(Integer key, Integer value){
        map.put(key,value);
    }

    public int getValue(Integer key){
        return map.get(key);
    }
}

