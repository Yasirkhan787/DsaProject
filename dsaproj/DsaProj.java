
package dsaproj;

import java.util.*;
public class DsaProj {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) 
        {
            System.out.println("Enter the Desired Data Structure \n 1.Array \n 2.Linked List \n 3.Stack \n 4.Queue \n 5.Exit");
            choice = sc.nextInt();
            switch (choice) 
            {
                case 1: 
                {
                    Array A = new Array();
                }       
                break;
                case 2: 
                {
                    LinkedList LS = new LinkedList();
                }       
                break;
                case 3:
                {
                    Stack ST = new Stack();
                }
                break;
                case 4:
                {
                    Queue QU = new Queue();
                }
                break;
                case 5: 
                {
                    return;
                }
                default: {
                    System.out.println("Invalid Selection");
                    return;
                }

            }
        }
    }  
}
