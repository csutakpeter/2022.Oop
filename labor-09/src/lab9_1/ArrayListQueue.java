package lab9_1;

import java.util.ArrayList;

public class ArrayListQueue implements IQueue{
    private int CAPACITY;
    private ArrayList<Object> items = new ArrayList<>();

    //constructor
    public ArrayListQueue(int CAPACITY) {
        this.CAPACITY = CAPACITY;
    }

    //methods
    @Override
    public boolean isEmpty() {
        if(items.size() == 0) return true;
        else return false;
    }
    @Override
    public boolean isFull() {
        if(items.size() == CAPACITY) return true;
        else return false;
    }
    @Override
    public void enQueue(Object newobj){
        if(!this.isFull()){
            items.add(newobj);
        }
    }
    @Override
    public Object deQueue(){
        if(!this.isEmpty()){
            //items.remove(items.get(0));
            Object item = items.get(0);
            items.remove(item);
            return item;
        }
        return null;
    }
    @Override
    public void printQueue(){
        StringBuffer result = new StringBuffer();
        System.out.println("\n" + "ArrayListQueue:");
        for(Object item : items){
            result.append(item + " ");
        }
        System.out.println(result);
    }

    @Override
    public boolean equals(Object compObj){
        if(this == compObj) return true;
        if(getClass() != compObj.getClass()) return false;
        if(this.items.size() != ((ArrayListQueue) compObj).items.size()) return false;
        for(int i=0; i<this.items.size(); ++i){
            if(this.items.get(i) != ((ArrayListQueue) compObj).items.get(i)) return false;
        }
        return true;
    }
}
