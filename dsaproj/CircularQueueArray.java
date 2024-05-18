
package dsaproj;

import java.util.*;

public class CircularQueueArray {
    Scanner sc = new Scanner(System.in);
    int S;          // S represent Size of an Array
    int CQu[];
    int LB=0;
    int Front = LB-1;
    int Rear = LB-1;
    int Item;
    CircularQueueArray()
    {
        System.out.println("Enter the size of Queue");
        S= sc.nextInt();
        CQu = new int[S];
        int option;
        while(true)
        {
            System.out.println("\nSelect What you want to do in Simple Queue on Array \n 1.Display Simple Queue \n 2.Insertion \n 3.Deletion \n 4.Exit(Return To Queue On Array Menu)");
            option = sc.nextInt();
            switch(option)
            {
                case 1 :
                {
                    displayCQ();
                }
                break;
                case 2 :
                {
                    insertionCQ();
                }
                break;
                case 3 :
                {
                    deletionCQ();
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
    
    //Display Circular Queue
    void displayCQ()
    {
        if (Front == LB-1)
        {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("The Element In Stack are :");
        for ( int i=Front ; i<=Rear ; i++)
        {
            System.out.print(CQu[i] + "\t");
        }
        System.out.println("");
    }
    
    //Display Circular Queue
    void insertionCQ()
    {
        if (((Rear == S+LB-1) && (Front == LB)) || (Rear == Front -1))
        {
            System.out.println("Queue is Full No insertion Possible");
            return;
        }
        if (Rear == LB-1)
        {
            Rear = LB;
            Front = LB;
        }
        else if (Rear == S+LB-1)
        {
            Rear = LB;
        }
        else
        {
            Rear++;
        }
        System.out.println("Enter the Value which you want to Push");
        Item = sc.nextInt();
        CQu[Rear]=Item;
        System.out.println("The Value Is Successfuly Inserted....");
    }
    
    //Display Circular Queue
    void deletionCQ()
    {
        if (Front == LB-1)
        {
            System.out.println("Queue is Empty No Deletion Possible");
            return;
        }
        if (Front == S+LB-1)
        {
            Front = LB;
        }
        else if (Front == Rear)
        {
            Front = LB-1;
            Rear = LB-1;
        }
        else
        {
            Front++;
        }
        Item = CQu[Front];
        System.out.println(Item + " Is Successfuly Poped....");
    }
}
