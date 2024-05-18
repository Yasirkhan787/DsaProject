
package dsaproj;

import java.util.*;

class QueueLinkedList {
    
    QueueLinkedList()
    {
        Scanner sc = new Scanner(System.in);
        int Opt;
        while(true)
        {
            System.out.println("\nSelect What you want to do in Queue On Linked List \n 1.Queue On Single Linked List \n 2.Queue On Double Linked List \n 3.Exit");
            Opt = sc.nextInt();
            switch(Opt)
            {
                case 1 :
                {
                    QueueSingleLinkedList QSLL = new QueueSingleLinkedList();
                }
                break;
                case 2 :
                {
                    QueueDoubleLinkedList QDLL = new QueueDoubleLinkedList();
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
