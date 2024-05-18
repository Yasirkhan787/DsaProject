
package dsaproj;

import java.util.Scanner;

public class Queue {
    Scanner sc = new Scanner(System.in);
    Queue(){
        int option;
        while(true)
        {
            System.out.println("\nSelect What you want to do in Queue \n 1.Queue On Array \n 2.Queue On Linked List \n 3.Exit");
            option = sc.nextInt();
            switch(option)
            {
                case 1:
                {
                    QueueArray QUA = new QueueArray();
                }
                break;
                case 2: 
                {
                    QueueLinkedList QULL = new QueueLinkedList();
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
