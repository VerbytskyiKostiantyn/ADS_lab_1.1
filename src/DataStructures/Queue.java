package DataStructures;
import java.util.EmptyStackException;

public class Queue {
    private String[] elemetsOfQueue; //array that exist all elements of queue
    private int tail = -1; //number of queue`s head

    //constructor
    public Queue(int size) {
        elemetsOfQueue = new String[size];
    }

    //check if queue(array) is full
    public boolean isFull() {
        if (tail + 1 == elemetsOfQueue.length) {
            return true;
        } else {
            return false;
        }
    }

    //check if queue(array) is empty
    public boolean isEmpty() {
        if (tail == -1) {
            return true;
        } else {
            return false;
        }
    }

    //add element to queue
    public boolean Add(String element) {
        if (isFull()) {
            return false;
        }

        if (!(element.charAt(0) == '0')){
            throw new RuntimeException();
        }

        tail++;
        elemetsOfQueue[tail] = element;

        return true;
    }

    //get first element from queue
    public String Get() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elemetsOfQueue[0];
    }

    //get last element from queue
    public String GetTail() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elemetsOfQueue[tail];
    }

    //delete head element and return it
    public String Delete() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        String deleteElement = elemetsOfQueue[0];
        for (int i = 0; i < elemetsOfQueue.length - 1; i++){
            elemetsOfQueue[i] = elemetsOfQueue[i+1];
        }
        elemetsOfQueue[tail] = null;
        tail--;

        return deleteElement;
    }
}
