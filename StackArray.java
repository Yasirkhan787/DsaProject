
package dsaproj;

import java.util.*;

public class StackArray {
    Scanner sc = new Scanner(System.in);
    int S;          // S represent Size of an Array
    int St[];
    int LB=0;
    int Top=LB-1;
    int Item;
    StackArray()
    {
        // Taking Input Stack Size from User
        System.out.println("Enter the size of Stack");
        S= sc.nextInt();
        St = new int[S];
        stackArrayMenu();
    }
    void stackArrayMenu()
    {
        int option;
        while(true)
        {
            System.out.println("\nSelect What you want to do in Stack on Array \n 1.Traverse \n 2.Push \n 3.Pop \n 4.Return To Main Menu");
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
        if (Top==LB-1)
        {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("The Element In Stack are :");
        for ( int i=Top ; i>=LB ; i-- )
        {
            System.out.print(St[i] + "\t");
        }
        System.out.println("");
    }
    
    // Push
    void push()
    {
        if (Top==S+LB-1)
        {
            System.out.println("Stack is Full");
            return;
        }
        System.out.println("Enter the Value which you want to Push");
        Item = sc.nextInt();
        Top++;
        St[Top]=Item;
        System.out.println("The Value Is Successfuly Pushed....");
    }
    
    //Pop
    void pop()
    {
        if (Top==LB-1)
        {
            System.out.println("Stack is Empty");
            return;
        }
        Item = St[Top];
        Top--;
        System.out.println(Item + " Is Successfuly Poped....");
    }
}
