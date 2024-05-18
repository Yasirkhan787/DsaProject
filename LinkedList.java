
package dsaproj;

import java.util.*;

public class LinkedList {
    Scanner sc = new Scanner(System.in);
    LinkedList()
    {
        linkedListMenu();
    }
    void linkedListMenu()
    {
        int Opt;
        while(true)
        {
            System.out.println("\nSelect What you want to do in Linked List \n 1.Single Linked List \n 2.Double Linked List \n 3.Exit");
            Opt = sc.nextInt();
            switch(Opt)
            {
                case 1 :
                {
                    SingleLinkedList SLL = new SingleLinkedList();
                }
                break;
                case 2 :
                {
                    DoubleLinkedList SLL = new DoubleLinkedList();
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
