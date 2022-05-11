package lab8_2;

public class Main {
    public static void main(String[] args){
        StackAggregation stack1 = new StackAggregation(5);
        for(int i=1; i<=5; ++i){
            stack1.push(i);
        }
        System.out.println(stack1.top());
        for(int i=0; i<2; ++i){
            stack1.pop();
        }
        stack1.printStack();

        ////
        System.out.print("StackAggregation : ");
        while( !stack1.isEmpty() ){
            System.out.print( stack1.top() + " ");
            stack1.pop();
        }
        System.out.println("\n**************stack1*****************");

        ////
        StackAggregation stack2 = new StackAggregation(5);
        for(int i=1; i<=5; ++i){
            String item = "item_" + String.valueOf(i);
            //System.out.println(item);
            stack2.push(item);
        }
        stack2.printStack();

        ////
        System.out.print("StackAggregation : ");
        while( !stack2.isEmpty() ){
            System.out.print( stack2.top() + " ");
            stack2.pop();
        }
        System.out.println("\n***************stack2****************\n");

        ////
        StackInheritance stack3 = new StackInheritance(5);
        for(int i=1; i<=5; ++i){
            stack3.push(i);
        }
        System.out.println(stack3.top());
        for(int i=0; i<2; ++i){
            stack3.pop();
        }
        stack3.printStack();
        System.out.println("\n***************stack3****************\n");

        ////
        StackInheritance stack4 = new StackInheritance( 5 );
        for( int i=0; i<10; ++i ){
            stack4.push( i );
        }
        stack4.remove( 1 );
        System.out.print("StackInheritance : ");
        while( !stack4.isEmpty() ){
            System.out.print( stack4.top() + " ");
            stack4.pop();
        }
        System.out.println("\n***************stack4****************");
    }
}
