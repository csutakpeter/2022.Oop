package lab8_2;

import java.util.ArrayList;

public class StackInheritance extends ArrayList<Object> {
    private int capacity;

    //constructor
    public StackInheritance(int capacity) {
        this.capacity = capacity;
    }

    //methods
    public boolean isFull(){
        if(this.size() == this.capacity) return true;
        else return false;
    }

    public boolean isEmpty(){
        if(this.size() == 0) return true;
        else return false;
    }

    public void push(Object item){
        if(!isFull()){
            this.add(item);
        }
    }

    public void pop(){
        if(!isEmpty()){
            this.remove(this.size()-1);
        }
    }

    public Object top(){
        return this.get(this.size()-1);
    }

    public void printStack(){
        System.out.println();
        for(Object item : this){
            System.out.println(item);
        }
    }
}
