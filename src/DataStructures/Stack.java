package DataStructures;
import java.util.EmptyStackException;

public class Stack {
    private double[] elemetsOfStack; //array that exist all elements of stack
    private int head = -1; //number of stack`s head

    //constructor
    public Stack(int size){
        elemetsOfStack = new double[size];
    }

    //check if stack(array) is full
    public boolean isFull(){
        if(head + 1 == elemetsOfStack.length){
            return true;
        }else{
            return false;
        }
    }

    //check if stack(array) is empty
    public boolean isEmpty(){
        if(head == -1){
            return true;
        }else{
            return false;
        }
    }

    //add element to stack
    public boolean Add(double element){
        if(isFull()){
            return false;
        }
        head++;
        elemetsOfStack[head] = element;

        return true;
    }

    //get head element from stack
    public double Get(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return elemetsOfStack[head];
    }

    //delete head element and return it
    public double Delete(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        double deleteElement = elemetsOfStack[head];
        elemetsOfStack[head] = 0;
        head--;

        return deleteElement;
    }
}
