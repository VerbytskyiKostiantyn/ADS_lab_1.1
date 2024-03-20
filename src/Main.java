import DataStructures.Queue;
import DataStructures.Stack;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public  static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        //ask queue length
        System.out.print("Please, print length of queue: ");
        int lengthOfQueue = scanner.nextInt();

        //create with random elements and print queue
        Queue queue = new Queue(lengthOfQueue);
        int curInt;
        String curString = null;
        System.out.print("\n");
        for (int i = 0; i < lengthOfQueue; i++) {
            boolean f = false;
            while(!f) {
                curInt = random.nextInt(400);
                curString = Integer.toString(curInt);
                if(!curString.contains("8") && !curString.contains("9")){
                    f = true;
                }
            }
            curString = "0" + curString;

            queue.Add(curString);

            System.out.print(queue.GetTail() + "  ");
        }

        //create a stack, populate it with queue`s elements with modification from task, and print it
        System.out.print("\n");
        Stack stack = new Stack(lengthOfQueue);
        String octalCurrentElement;
        Double decimalCurrentElement;
        for (int i =0; i< lengthOfQueue; i++){
            octalCurrentElement = queue.Delete();
            decimalCurrentElement = (double)Integer.parseInt(octalCurrentElement, 8);
            if(decimalCurrentElement > 200){
                decimalCurrentElement = decimalCurrentElement / 2;
            }else if(decimalCurrentElement < 200){
                decimalCurrentElement = decimalCurrentElement * 2;
            }
            stack.Add(decimalCurrentElement);
            System.out.print(stack.Get() + "  ");
        }
    }
}
