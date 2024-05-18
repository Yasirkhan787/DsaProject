
package dsaproj;

import java.util.*;

public class QueueArray {
    Scanner sc = new Scanner(System.in);
    QueueArray(){
        int option;
        while(true)
        {
            System.out.println("\nSelect What you want to do in Queue on Array \n 1.Simple Queue On Array \n 2.Circular Queue On Array \n 3.Exit");
            option = sc.nextInt();
            switch(option)
            {
                case 1:
                {
                    SimpleQueueArray QUA = new SimpleQueueArray();
                }
                break;
                case 2: 
                {
                    CircularQueueArray QUA = new CircularQueueArray();
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
