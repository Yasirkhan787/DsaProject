
package dsaproj;

import java.util.*;

public class SimpleQueueArray {
    Scanner sc = new Scanner(System.in);
    int S;          // S represent Size of an Array
    int SQu[];
    int LB=0;
    int Front = LB-1;
    int Rear = LB-1;
    int Item;
    SimpleQueueArray()
    {
        // Taking Input Queue Size from User
        System.out.println("Enter the size of Queue");
        S= sc.nextInt();
        SQu = new int[S];
        int option;
        while(true)
        {
            System.out.println("\nSelect What you want to do in Simple Queue on Array \n 1.Display Simple Queue \n 2.Insertion \n 3.Deletion \n 4.Exit(Return To Queue On Array Menu)");
            option = sc.nextInt();
            switch(option)
            {
                case 1 :
                {
                    displaySQ();
                }
                break;
                case 2 :
                {
                    insertionSQ();
                }
                break;
                case 3 :
                {
                    deletionSQ();
                }
                case 4 :
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
    
    // Display Simple Queue
    void displaySQ()
    {
        if (Front == LB-1)
        {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("The Element In Stack are :");
        for ( int i=Front ; i<=Rear ; i++)
        {
            System.out.print(SQu[i] + "\t");
        }
        System.out.println("");
    }
    
    // Display Simple Queue
    void insertionSQ()
    {
        if (Rear == S+LB-1)
        {
            System.out.println("Queue is Full No insertion Possible");
            return;
        }
        if (Rear == LB-1)
        {
            Rear = LB;
            Front = LB;
        }
        else
        {
            Rear++;
        }
        System.out.println("Enter the Value which you want to Push");
        Item = sc.nextInt();
        SQu[Rear]=Item;
        System.out.println("The Value Is Successfuly Inserted....");
    }
    
    // Display Simple Queue
    void deletionSQ()
    {
        if (Front == LB-1)
        {
            System.out.println("Queue is Empty No Deletion Possible");
            return;
        }
        if (Front == Rear)
        {
            Front = LB-1;
            Rear = LB-1;
        }
        else
        {
            Front++;
        }
        Item = SQu[Front];
        System.out.println(Item + " Is Successfuly Poped....");
    }
}
