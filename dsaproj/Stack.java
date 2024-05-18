
package dsaproj;

import java.util.*;

public class Stack {
    Scanner sc = new Scanner(System.in);
    Stack(){
        int option;
        while(true)
        {
            System.out.println("\nSelect What you want to do in Stack \n 1.Stack On Array \n 2.Stack On Linked List \n 3.Exit");
            option = sc.nextInt();
            switch(option)
            {
                case 1:
                {
                    StackArray STA = new StackArray();
                }
                break;
                case 2: 
                {
                    StackLinkedList STLL = new StackLinkedList();
                }
                break;
                case 3:
                {
                    return;
                }
                default :
                {
                    System.out.println("Invalid Selection");
                }
            }
        }
    }
}
