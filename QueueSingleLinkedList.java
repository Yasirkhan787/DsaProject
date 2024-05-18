
package dsaproj;

import java.util.*;

class QueueSingleLinkedList {
    Scanner sc = new Scanner(System.in);
    int Item;
    class QSLL
    {
        int info;
        QSLL next;
    }
    QSLL Front = null;
    QSLL Rear = null;
     
    // Queue Double Linked List Menu
    QueueSingleLinkedList()
    {
        int option;
        while(true)
        {
            System.out.println("\nSelect What you want to do in Queue on Single Linked List (SLL) \n 1.Traverse \n 2.Enqueue \n 3.Dequeue \n 4.Return To Main Menu");
            option = sc.nextInt();
            switch(option)
            {
                case 1:
                {
                    traverse();
                }
                break;
                case 2: 
                {
                    enQueue();
                }
                break;
                case 3: 
                {
                    deQueue();
                }
                break;
                case 4:
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
    
    // Traverse
    void traverse()
    {
        if (Front == null)
        {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("The Element In Queue are :");
        QSLL ptr = Front;
        while (ptr != Rear)
        {
            System.out.print(ptr.info + "\t");
            ptr = ptr.next;
        }
        System.out.print(ptr.info + "\t");
        System.out.println("");
    }
    
    // Insertion
    void enQueue()
    {
        System.out.println("Enter the Value which you want to Enqueue");
        Item = sc.nextInt();
        QSLL ptrNew = new QSLL();
        ptrNew.info = Item;
        ptrNew.next = null;
        if (Rear == null)
        {
            Rear = ptrNew;
            Front = ptrNew;
            System.out.println("The Value Is Successfuly Pushed....");
            return;
        }
        Rear.next = ptrNew;
        Rear = ptrNew;
        System.out.println("The Value Is Successfuly Pushed....");
    }
    
    // Deletion
    void deQueue()
    {
         if (Front==null)
        {
            System.out.println("Queue is Empty");
            return;
        }
        Item = Front.info;
        if (Front.next == null)
        {
            Front = null;
            Rear = null;
            System.out.println(Item + " Is Successfuly Poped....");
            return;
        }
        Front =Front.next;
        System.out.println(Item + " Is Successfuly Poped....");
    }
}
