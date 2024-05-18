
package dsaproj;

import java.util.Scanner;

public class StackSingleLinkedList {
    Scanner sc = new Scanner(System.in);
    int Item;
    class SSLL
    {
        int info;
        SSLL next;
    }
    SSLL Top = null;
    StackSingleLinkedList()
    {
        int option;
        while(true)
        {
            System.out.println("\nSelect What you want to do in Stack on Single Linked List (SLL) \n 1.Traverse \n 2.Push \n 3.Pop \n 4.Return To Main Menu");
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
                    push();
                }
                break;
                case 3: 
                {
                    pop();
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
        if (Top==null)
        {
            System.out.println("Stack is Empty");
            return;
        }
        SSLL ptr = Top;
        System.out.println("The Element in Linked List are :");
        while (ptr != null) 
        {
            System.out.print(ptr.info + "\t");
            ptr = ptr.next;
        }
        System.out.println("");
    }
    
    // Push
    void push()
    {
        System.out.println("Enter the Value which you want to Push");
        Item = sc.nextInt();
        SSLL ptrNew = new SSLL();
        ptrNew.info = Item;
        ptrNew.next = Top;
        Top = ptrNew;
        System.out.println("The Value Is Successfuly Pushed....");
    }
    
    //Pop
    void pop()
    {
        if (Top==null)
        {
            System.out.println("Stack is Empty");
            return;
        }
        Item = Top.info;
        Top =Top.next;
        System.out.println(Item + " Is Successfuly Poped....");
    }
}

