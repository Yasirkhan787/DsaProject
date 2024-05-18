
package dsaproj;

import java.util.Scanner;

public class StackLinkedList {
    Scanner sc = new Scanner(System.in);
    StackLinkedList()
    {
        int Opt;
        while(true)
        {
            System.out.println("\nSelect What you want to do in Stack On Linked List \n 1.Stack On Single Linked List \n 2.Stack On Double Linked List \n 3.Exit");
            Opt = sc.nextInt();
            switch(Opt)
            {
                case 1 :
                {
                    StackSingleLinkedList SLL = new StackSingleLinkedList();
                }
                break;
                case 2 :
                {
                    StackDoubleLinkedList SLL = new StackDoubleLinkedList();
                }
                break;
                case 3 :
                {
                    return;
                }
            }
        }
    }
}
