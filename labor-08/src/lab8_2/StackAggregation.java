package lab8_2;

import java.util.ArrayList;

public class StackAggregation {
    private int capacity;
    private ArrayList<Object> items = new ArrayList<>();

    //constructor
    public StackAggregation(int capacity) {
        this.capacity = capacity;
    }

    //methods
    public boolean isFull(){
        if(items.size() == this.capacity) return true;
        else return false;
    }

    public boolean isEmpty(){
        if(items.size() == 0) return true;
        else return false;
    }

    public void push(Object item){
        if(!isFull()){
            items.add(item);
        }
    }

    public void pop(){
        if(!isEmpty()){
            items.remove(items.size()-1);
        }
    }

    public Object top(){
        return items.get(items.size()-1);
    }

    public void printStack(){
        System.out.println();
        for(Object item : items){
            System.out.println(item);
        }
    }
}
