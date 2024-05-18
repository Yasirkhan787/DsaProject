
package dsaproj;

import java.util.*;

public class DoubleLinkedList {
    int Item;
    Scanner sc = new Scanner(System.in);
    class DLL 
    {
        int info;
        DLL prev;
        DLL next;
    }
    DLL Start = null;
    int SItem;
    DLL Node;
    
    // Single Linked List Menu
    DoubleLinkedList() 
    {
        int option;
        while (true) 
        {
            System.out.println("\nSelect What you want to do in Double Linked List(DLL) \n 1.Traverse \n 2.Insertion \n 3.Deletion \n 4.Return To Main Menu");
            option = sc.nextInt();
            switch (option) 
            {
                case 1: 
                {
                    traverse();
                }
                break;
                case 2: 
                {
                    insertion();
                    System.out.println("Where Do You Want to Insert Value in Double Linked List(DLL) \n 1.Insertion at First \n 2.Insertion at Last \n 3.Insertion at Mid \n 4.Insertion In Sorted SLL \n 5.Exit");
                    int Opt = sc.nextInt();
                    switch (Opt) 
                    {
                        case 1: 
                        {
                            insertionAtFirst();
                        }
                        break;
                        case 2: 
                        {
                            insertionAtLast();
                        }
                        break;
                        case 3: 
                        {
                            System.out.println("Where Do You Want To Insert Value At Mid \n 1.Insertion At Mid by Refrence of Given Node \n 2.Insertion At Mid by Refrence of Exactly Middle Node \n 3.Return");
                            int Mop = sc.nextInt();
                            switch (Mop) 
                            {
                                case 1: 
                                {
                                    System.out.println("Where Do You Want To Insert Value At Mid by Refrence of Given Node \n 1.Insertion At Mid Before Given Node \n 2.Insertion At Mid After Given Node \n 3.Return");
                                    int Mopt = sc.nextInt();
                                    switch (Mopt)
                                    {
                                        case 1 :
                                        {
                                            insertionAtMidBGN();
                                        }
                                        break;
                                        case 2 :
                                        {
                                            insertionAtMidAGN();
                                        }
                                        break;
                                        case 3 :
                                        {
                                            return;
                                        }
                                    }
                                }
                                break;
                                case 2: 
                                {
                                    System.out.println("Where Do You Want To Insert Value At Mid by Refrence of Exactly Middle Node \n 1.Insertion At Mid Before Exactly Middle Node \n 2.Insertion At Mid After Exactly Middle Node \n 3.Return");
                                    int Mopt = sc.nextInt();
                                    switch (Mopt)
                                    {
                                        case 1 :
                                        {
                                            insertionAtExactMidBGN();
                                        }
                                        break;
                                        case 2 :
                                        {
                                            insertionAtExactMidAGN();
                                        }
                                        break;
                                        case 3 :
                                        {
                                            return;
                                        }
                                    }
                                }
                                break;
                                case 3: 
                                {
                                    return;
                                }
                            }
                        }
                        break;
                        case 4: 
                        {
                            System.out.println("Where Do You Want To Insert Value In Sorted Double Linked List(SLL) \n 1.Insertion in Sorted(Ascending Order) DLL \n 2.Insertion in Sorted(Descending Order) DLL  \n 3.Return");
                            int Sop = sc.nextInt();
                            switch (Sop) 
                            {
                                case 1: 
                                {
                                    insertionInSLL_Asc();
                                }
                                break;
                                case 2: 
                                {
                                    insertionInSLL_Dsc();
                                }
                                break;
                                case 3: 
                                {
                                    return;
                                }
                            }
                        }
                        break;
                        case 5: 
                        {
                            return;
                        }
                    }
                }
                break;
                case 3 :
                {
//                    deletion();
                    System.out.println("Where Do You Want to Delete Value in Double Linked List(DLL) \n 1.Deletion at First \n 2.Deletion at Last \n 3.Deletion at Mid \n 4.Exit");
                    int Opt = sc.nextInt();
                    switch (Opt) 
                    {
                        case 1: 
                        {
                            deletionAtFirst();
                        }
                        break;
                        case 2: 
                        {
                            deletionAtLast();
                        }
                        break;
                        case 3: 
                        {
                            System.out.println("Where Do You Want To Delete Value At Mid \n 1.Deletion At Mid by Refrence of Given Node \n 2.Deletion At Mid by Refrence of Exactly Middle Node \n 3.Return");
                            int Mop = sc.nextInt();
                            switch (Mop) 
                            {
                                case 1:
                                {
                                    deletionAtMiddleGNode();
                                }
                                break;
                                case 2:
                                {
                                    deletionAtExactlyMiddle();
                                }
                                break;
                                case 3: 
                                {
                                    return;
                                }
                            }
                        }
                    }
                }
                break;
                case 4 :
                {
                    return;
                }
                default:
                {
                    System.out.println("Invalid Selection");
                }
            }
        }
    }
    
    // Traverse
    void traverse()
    {
            if (Start == null)
            {
                System.out.println("Linked List is Empty");
                return;
            }
            DLL ptr = Start;
            System.out.println("The Element in Linked List are :");
            while (ptr != null) 
            {
                System.out.println(ptr.info + "\t");
                ptr = ptr.next;
            }
    }
    
    // Insertion
    void insertion()
    {
        System.out.println("Enter the Value You Want to Insert : ");
        Item = sc.nextInt();
    }
     
    // Insertion At First
    void insertionAtFirst()
    {
        DLL ptrNew = new DLL();
        ptrNew.info = Item;
        ptrNew.prev = null;
        ptrNew.next = Start;
        Start = ptrNew;
    }
        
    // Insertion At Last
    void insertionAtLast()
    {
        DLL ptrNew = new DLL();    
        ptrNew.info = Item;
        ptrNew.next = null;
        if (Start ==  null)
        {
            ptrNew.prev = null;
            Start = ptrNew;
            return;
        }
        DLL ptr = Start;
        while (ptr.next != null) 
        {
            ptr = ptr.next;
        }
        ptrNew.prev = ptr;
        ptr.next = ptrNew;
    }
    
    // Insertion At Middle Before Given Node
        void insertionAtMidBGN() 
        {
            Node = Start;
            System.out.println("Enter the Info of the Node before You Want to Insert the Value: ");
            SItem = sc.nextInt();
            while ((Node != null) && (Node.info != SItem))
            {
                Node = Node.next;
            }
            if (Node == null)
            {
                System.out.println("Node Info Not Found");
                return;
            }
            DLL ptrNew = new DLL();   
            ptrNew.info = Item;
            ptrNew.next = Node;
            ptrNew.prev = Node.prev;
            Node.prev = ptrNew;
            if (ptrNew.prev == null)
            {
                Start = ptrNew;
                return;
            }
            ptrNew.prev.next = ptrNew;
        }

        //Insertion AT Middle After Given Node
        void insertionAtMidAGN() 
        {
            Node = Start;
            System.out.println("Enter the Info of the Node before You Want to Insert the Value: ");
            SItem = sc.nextInt();
            while ((Node != null) && (Node.info != SItem))
            {
                Node = Node.next;
            }
            if (Node == null)
            {
                System.out.println("Node Info Not Found");
                return;
            }
            DLL ptrNew = new DLL();
            ptrNew.info = Item;
            ptrNew.next = Node.next;
            if (Node.next != null)
            {
                Node.next.prev = ptrNew;
            }
            ptrNew.prev = Node;
            Node.next = ptrNew;
        }
      
        // Insertion At Exactly Middle Before Given Node
        void insertionAtExactMidBGN()
        {
            int Count = 0;
            DLL ptr = Start;
            while (ptr != null)
            {
                Count++;
                ptr = ptr.next;
            }
            int Mid = (Count/2)+1;
            DLL ptrNew = new DLL();   
            ptrNew.info = Item;
            if (Count == 0)
            {
                ptrNew.next = null;
                ptrNew.prev = null;
                Start = ptrNew;
                return;
            }
            ptr = Start;
            for (int i=0 ; i< Mid-1 ; i++)
            {
                ptr = ptr.next;
            }
            ptrNew.prev = ptr.prev;
            ptrNew.next = ptr;
            ptr.prev = ptrNew;
            if (ptrNew.prev == null)
            {
                Start = ptrNew;
                return;
            }
            ptrNew.prev.next = ptrNew;
        }
       
        // Insertion At Exactly Middle After Given Node
        void insertionAtExactMidAGN()
        {
            int Count = 0;
            DLL ptr = Start;
            while (ptr != null)
            {
                Count++;
                ptr = ptr.next;
            }
            int Mid = (Count/2)+1;
            DLL ptrNew = new DLL();   
            ptrNew.info = Item;
            if (Count == 0)
            {
                ptrNew.next = null;
                ptrNew.prev = null;
                Start = ptrNew;
                return;
            }
            ptr = Start;
            for (int i=0 ; i< Mid-1 ; i++)
            {
                ptr = ptr.next;
            }
            ptrNew.prev = ptr;
            ptrNew.next = ptr.next;
            ptr.next = ptrNew;
            if (ptrNew.next != null)
            {
                ptrNew.next.prev = ptrNew;
            }
        }
    
    //
    void insertionInSLL_Asc()
    {
        DLL ptr = Start;
        while ((ptr != null) && (ptr.info < Item))
        {
            ptr = ptr.next;
        }
        DLL ptrNew = new DLL();
        ptrNew.info = Item;
        if (Start == null)
        {
            ptrNew.prev = null;
            ptrNew.next = null;
            Start = ptrNew;
            return;
        }
        if (ptr == null)
        {
            ptrNew.next = null;
            DLL ptr1 = Start;
            while (ptr1.next != null)
            {   
                ptr1 = ptr1.next;
            }
            ptrNew.prev = ptr1;
            ptr1.next = ptrNew;
            return;
        }
        if (ptr == Start)
        {
            ptrNew.prev = null;
            ptrNew.next = ptr;
            ptr.prev = ptrNew;
            Start = ptrNew;
            return;
        }
        ptrNew.next = ptr;
        ptrNew.prev = ptr.prev;
        ptr.prev = ptrNew;
        if (ptr.prev == null)
        {
            Start = ptrNew;
            return;
        }
        ptrNew.prev.next = ptrNew;
    }
    
    //
    void insertionInSLL_Dsc()
    {
         DLL ptr = Start;
        while ((ptr != null) && (ptr.info > Item))
        {
            ptr = ptr.next;
        }
        DLL ptrNew = new DLL();
        ptrNew.info = Item;
        if (Start == null)
        {
            ptrNew.prev = null;
            ptrNew.next = null;
            Start = ptrNew;
            return;
        }
        if (ptr == null)
        {
            ptrNew.next = null;
            DLL ptr1 = Start;
            while (ptr1.next != null)
            {   
                ptr1 = ptr1.next;
            }
            ptrNew.prev = ptr1;
            ptr1.next = ptrNew;
            return;
        }
        if (ptr == Start)
        {
            ptrNew.prev = null;
            ptrNew.next = ptr;
            ptr.prev = ptrNew;
            Start = ptrNew;
            return;
        }
        ptrNew.next = ptr;
        ptrNew.prev = ptr.prev;
        ptr.prev = ptrNew;
        if (ptr.prev == null)
        {
            Start = ptrNew;
            return;
        }
        ptrNew.prev.next = ptrNew;
    }
    // Deletion
    
    // Deletion At First
    void deletionAtFirst()
    {
        if (Start == null)
            {
                System.out.println("Linked List is Empty");
                return;
            }
            DLL ptr = Start;
            Start  = Start.next;
            if (Start != null)
            {
                Start.prev = null;
            }
            System.out.println(ptr.info + " Deleted");
//            ptr.finalize();
    }
    
    // Deletion At Last
    void deletionAtLast()
    {
        if (Start == null)
            {
                System.out.println("Linked List is Empty");
                return;
            }
            DLL ptr = Start;
            if (ptr.next == null)
            {
                Start = null;
                System.out.println(ptr.info + " Deleted");
//                free memory
                return;
            }
            while (ptr.next.next != null)
            {
                ptr = ptr.next;
            }
            DLL ptr1 = ptr.next;
            ptr.next = null;
            System.out.println(ptr1.info + " Deleted");
//            free memory
    }
    
    // Deletion At Middle Given Node
    void deletionAtMiddleGNode()
    {
        if (Start == null)
            {
                System.out.println("Linked List is Empty");
                return;
            }
            Node = Start;
            System.out.println("Enter the Info of the Node that You Want to Delete: ");
            SItem = sc.nextInt();
            while ((Node.next != null) && (Node.info != SItem))
            {
                Node = Node.next;
            }
            if ((Node.next == null) && (Node.info != SItem))
            {
                System.out.println("Node Info Not Found");
                return;
            }
            DLL ptr = Start;
            if (ptr == Node)
            {
                Start = Node.next;
                System.out.println(Node.info + " Deleted");
//                ptr.finalize();
                return;
            }
            while (ptr.next != Node)
            {
                ptr = ptr.next;
            }
            ptr.next = Node.next;
            System.out.println(Node.info + " Deleted");
//                ptr.finalize();
    }
    
    // Deletion At Exactly Middle 
    void deletionAtExactlyMiddle()
    {
        if (Start == null)
            {
                System.out.println("Linked List is Empty");
                return;
            }
            int Count = 0;
            DLL ptr = Start;
            while (ptr != null)
            {
                Count++;
                ptr = ptr.next;
            }
            int Mid = (Count/2)+1;
            ptr = Start;
            for (int i=0 ; i< Mid-1 ; i++)
            {
                ptr = ptr.next;
            }
            DLL ptr1 = Start;
            if (ptr1.next == null)
            {
                Start = null;
                System.out.println(ptr.info + " Deleted");
//                ptr.finalize();
                return;
            }
            while (ptr1.next != ptr)
            {
                ptr1 = ptr1.next;
            }
            System.out.println(ptr.info + " Deleted");
            ptr1.next = ptr.next;
//          ptr.finalize();
    }   
}
