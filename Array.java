
package dsaproj;

import java.util.*;
public class Array {
    Scanner sc = new Scanner(System.in);
    int LB = 0;     // LB represent lower bound
    int N = 0;      // N represent No of element in an Array
    int S;          // S represent Size of an Array
    int K;          // K represent Position in an Array
    int Item;       // Item represent 
    int Arr [];     //Decleration of Array
    int First = LB;
    int NA;         //Number of Element in First Array
    int NB;         //Number of Element in Second Array
    int A[];
    int B[];
    
    // Array Constructre 
    Array(){
        // Taking input array size from user
        System.out.println("Enter the size of an Array");
        S= sc.nextInt();
        Arr = new int[S];
        arrayMenu();
    }
    
    //Array Menu Function
        void arrayMenu(){
        int option;
        while(true)
        {
            System.out.println("\nSelect What you want to do in  an Array \n 1.Traverse \n 2.Insertion \n 3.Deletion \n 4.Searching \n 5.Sorting \n 6.Merging \n 7.Return To Main Menu");
            option = sc.nextInt();
            switch(option)
            {
                case 1 :
                {
                    traverse();
                }
                break;
                case 2 :
                {
                    insertion();
                }
                break;
                case 3 :
                {
                   deletion(); 
                }
                break;
                case 4 :
                {
                    searching();
                    System.out.println("Which Search you want \n 1.Single Search \n 2.Multi Search \n 3.Exit");
                    int search = sc.nextInt();
                    switch(search)
                    {
                        case 1 :
                        {
                            System.out.println("Which Search you want in Single Searching \n 1.Single Linear Search \n 2.Single Binary Search \n 3.Exit");
                            int sop1 = sc.nextInt();
                            switch(sop1)
                            {
                                case 1 :
                                {
                                    singleLinearSearch();
                                }
                                break;
                                case 2 :
                                {
                                    singleBinarySearch();
                                }
                                break;
                                case 3 :
                                {
                                    return;
                                }
                            }
                        }
                        break;
                        case 2 :
                        {
                            System.out.println("Which Search you want in Multi Searching \n 1.Multi Linear Search \n 2.Multi Binary Search \n 3.Return To Array Menu");
                            int sop2 = sc.nextInt();
                            switch(sop2)
                            {
                                case 1 :
                                {
                                    multiLinearSearch();
                                }
                                break;
                                case 2 :
                                {
                                    multiBinarySearch();
                                }
                                break;
                                case 3 :
                                {
                                    return;
                                }
                            }
                        }
                        break;
                        case 3 :
                        {
                            return;
                        }    
                    }
                }
                break;
                case 5 :
                {
                   sorting();
                   int Sort; 
                   System.out.println("Which Sorting Method You Want To Do \n 1.Bubble Sort \n 2.Selection Sort \n 3.Insertion Sort \n 4.Shell Sort \n 5.Merge Sort \n 6.Quick Sort \n 7.Return To Array Menu");
                   Sort = sc.nextInt();
                   switch(Sort)
                   {
                       case 1 :
                       {
                           int Opt;
                           System.out.println("In Which Order You Want To Sort An Array \n 1.Asceding Order \n 2.Descending Order \n 3.Return To Array Menu");
                           Opt = sc.nextInt();
                           switch(Opt)
                           {
                               case 1 :
                               {
                                   bubbleSortAscend();
                               }
                               break;
                               case 2 :
                               {
                                   bubbleSortDescend();
                               }
                               break;
                               case 3 :
                               {
                                   return;
                               }
                           }
                       }
                       break;
                       case 2 :
                       {
                           int Opt;
                           System.out.println("In Which Order You Want To Sort An Array \n 1.Asceding Order \n 2.Descending Order \n 3.Return To Array Menu");
                           Opt = sc.nextInt();
                           switch(Opt)
                           {
                               case 1 :
                               {
                                   selectionSortAscend();
                               }
                               break;
                               case 2 :
                               {
                                   selectionSortDescend();
                               }
                               break;
                               case 3 :
                               {
                                   return;
                               }
                           }
                       }
                       break;
                       case 3 :
                       {
                           int Opt;
                           System.out.println("In Which Order You Want To Sort An Array \n 1.Asceding Order \n 2.Descending Order \n 3.Return To Array Menu");
                           Opt = sc.nextInt();
                           switch(Opt)
                           {
                               case 1 :
                               {
                                   insertionSortAscend();
                               }
                               break;
                               case 2 :
                               {
                                   insertionSortDescend();
                               }
                               break;
                               case 3 :
                               {
                                   return;
                               }
                           }
                       }
                       break;
                       case 4 :
                       {
                           int Opt;
                           System.out.println("In Which Order You Want To Sort An Array \n 1.Asceding Order \n 2.Descending Order \n 3.Return To Array Menu");
                           Opt = sc.nextInt();
                           switch(Opt)
                           {
                               case 1 :
                               {
                                   shellSortAscend();
                               }
                               break;
                               case 2 :
                               {
                                   shellSortDescend();
                               }
                               break;
                               case 3 :
                               {
                                   return;
                               }
                           }
                       }
                       break;
                       case 5 :
                       {
                           int Opt;
                           System.out.println("In Which Order You Want To Sort An Array \n 1.Asceding Order \n 2.Descending Order \n 3.Return To Array Menu");
                           Opt = sc.nextInt();
                           switch(Opt)
                           {
                               case 1 :
                               {
                                   mergeSortAscend();
                               }
                               break;
                               case 2 :
                               {
                                   mergeSortDescend();
                               }
                               break;
                               case 3 :
                               {
                                   return;
                               }
                           }
                       }
                       break;
                       case 6 :
                       {
                           int Opt;
                           System.out.println("In Which Order You Want To Sort An Array \n 1.Asceding Order \n 2.Descending Order \n 3.Return To Array Menu");
                           Opt = sc.nextInt();
                           switch(Opt)
                           {
                               case 1 :
                               {
                                   quickSortAscend();
                               }
                               break;
                               case 2 :
                               {
                                   quickSortDescend();
                               }
                               break;
                               case 3 :
                               {
                                   return;
                               }
                           }
                       }
                       break;
                       case 7 :
                       {
                           return;
                       }
                   }
                }
                break;
                case 6 :
                {
                    merging();
                }
                break;
                case 7 :
                {
                    return;
                }
                default :
                    System.out.println("Invalid Searching");
            }
        }
    }
    // Traverse 
    void traverse()
    {
        //If the number of element in Array is zero then the following statement is execute
        if(N == 0)
        {
            System.out.println("Array Is Empty");
            return;         
        }
        // If Array have element then for loop execute and display the Array
        System.out.println("The Element In Array are :");
        for ( int i=LB ; i<=N+LB-1 ; i++ )
        {
            System.out.print(Arr[i] + "\t");
        }
        System.out.println("");
    }
    
    // Insertion
    void insertion()
    {
        // If the No of Element is equal to the size of an Array then insertion is not possible 
        if(N == S)
        {
            System.out.println("Array Is Full");
            return;
        }
        /* If the No of Element is not equal to the size of an Array 
           then the user input the position where the element will inserted 
           and if statement check the validity of  position */
        System.out.println("Enter the Position Where you Insert Value");
        K = sc.nextInt();
        //
        if((K<LB) || (K>(N+LB)))
        {
            System.out.println("Invalid Position For Insertion");
            return;
        }
        // If the position is valid then again user input the value that will inserted 
        System.out.println("Enter the Value which you want to insert");
        Item = sc.nextInt();
        for (int i = ((N+LB)-1) ; i >= K ; i--){
            Arr[i+1]=Arr[i];
        }
        Arr[K]= Item;
        N++;
        System.out.println("The Value Is Successfuly Inserted....");
    }
    
    // Deletion
    void deletion()
    {
        // If the No of Element is equal to the size of an Array then insertion is not possible
        if(N==0)
        {
            System.out.println("Array is Empty");
            return;
        }
        // Checkking The validity of  position
        System.out.println("Enter the Position From Where you Deleting the Value");
        K = sc.nextInt();
        if((K<LB) || (K>(N+LB-1)))
        {
            System.out.println("Invalid Position For Deletion");
            return;
        }
        for(int i = K+1 ; i<=(N+LB-1) ; i++)
        {
            Arr[i-1] = Arr[i];
        }
        N--;
        System.out.println("The Value Is Sucessfuly Deleted :");
    }
    
    // Searching
    void searching()
    {
        //If the number of element in Array is zero then the following statement is execute
        if(N == 0)
        {
            System.out.println("Array Is Empty No searching Possible");
            return;
        }
    }
    // Single Linear Search
    void singleLinearSearch()
    {
        System.out.println("Enter The Value Which You Want To Search");
        Item = sc.nextInt();
        for(int i = LB ; i<= (N+LB-1) ; i++)
        {
            if(Arr[i] == Item)
            {
                System.out.println(Item + "Found At " + i +" Index");
                return;
            }
        }
        System.out.println(Item + "Not Found");
    }
    
    // Single Binary Search()
    void singleBinarySearch()
    {
        System.out.println("Enter The Value Which You Want To Search");
        Item = sc.nextInt();
        int Low = LB;
        int High = N+LB-1;
        int Mid;
        while(Low<=High)
        {
            Mid = ((Low+High)/2);
            if(Arr[Mid] == Item)
            {
                System.out.println(Item + "Found At " + Mid +" Index");
                return;
            }
            else if(Arr[Mid]<Item)
            {
                Low = Mid + 1;
            }
            else
            {
                High = Mid -1;
            }
        }
        System.out.println(Item + "Not Found");
    }
    
    // Multi Linear Search
    void multiLinearSearch()
    {
        int Count=0;
        System.out.println("Enter The Value Which You Want To Search");
        Item = sc.nextInt();
        for(int i = LB ; i<= (N+LB-1) ; i++)
        {
            if(Arr[i] == Item)
            {
                Count = Count + 1;
            }
        }
        if(Count == 0)
        {
            System.out.println(Item + "Not Found");
            return;
        }
        else
        {
            System.out.println(Item + "Found " + Count + " Times");
        }
    }
    
    // Multi Binary Search()
    void multiBinarySearch()
    {
        System.out.println("Enter The Value Which You Want To Search");
        Item = sc.nextInt();
        int Low = LB;
        int High = N+LB-1;
        int Mid;
        int Count = 0;
        while(Low<=High)
        {
            Mid = ((Low + High)/2);
            if(Arr[Mid] == Item)
            {
                Count++;
                int i = Mid + 1;
                while((i<=High) && (Arr[i] == Item))
                {
                    Count++;
                    i++;
                    i = Mid -1;
                    while((i>=Low) && (Arr[i] == Item))
                    {
                        Count++;
                        i--;
                    }
                    System.out.println(Item + "Found " +Count +" Times");
                    return;
                }
            }
        }
        System.out.println(Item + "Not Found");
    }
    
    //Sorting
    void sorting()
    {
        if(N == 0)
        {
            System.out.println("Array Is Empty No Sorting Possible");
            return;
        }
    }
    // Bubble Sort in Asceding Order
    
    void bubbleSortAscend()
    {
        int Last = (N+LB-1);
        for (int i=LB ; i<(N+LB-1) ; i++)
        {
            for (int j=LB ; j<Last ; j++)
            {
                if (Arr[j] > Arr[j+1])
                {
                    int temp = Arr[j];
                    Arr[j] = Arr[j+1];
                    Arr[j+1] = temp;
                }
            }
        }
        System.out.println("Array has been Sorted Successfuly.....");
    }
    
    // Bubble Sort in Desceding Order
    void bubbleSortDescend()
    {
        int Last = (N+LB-1);
        for (int i=LB ; i<Last ; i++)
        {
            for (int j=LB ; j<Last ; j++)
            {
                if (Arr[j] < Arr[j+1])
                {
                    int temp = Arr[j];
                    Arr[j] = Arr[j+1];
                    Arr[j+1] = temp;
                }
            }
        }
        System.out.println("Array has been Sorted Successfuly.....");
    }
    
    // Selection Sort in Asceding Order
    
    void selectionSortAscend()
    {
        First = LB;
        for (int i=1 ; i<=(N-1) ; i++)
        {
            int minLoc = First;
            for (int j=(First+1) ; j<=(N+LB-1) ; j++)
            {
                if (Arr[minLoc] > Arr[j])
                {
                    minLoc = j;
                }   
            }
            int temp = Arr[First];
            Arr[First] = Arr[minLoc];
            Arr[minLoc] = temp;
            First++;
        }
        System.out.println("Array has been Sorted Successfuly.....");
    }
    
    // Selection Sort in Descending Order
    void selectionSortDescend()
    {
        First = LB;
        for (int i=1 ; i<=(N-1) ; i++)
        {
            int minLoc = First;
            for (int j=(First + 1) ; j<=(N+LB-1) ; j++)
            {
                if (Arr[minLoc] < Arr[j])
                {
                    minLoc = j;
                }
            }
            int temp = Arr[First];
            Arr[First] = Arr[minLoc];
            Arr[minLoc] = temp;
            First++;
        }
        System.out.println("Array has been Sorted Successfuly.....");
    }
    
    // Insertion Sort in Asceding Order
    void insertionSortAscend()
    {
        int Last =LB+1;
        for (int i=LB; i<(N+LB-1); i++)
        {
            int Min = Arr[Last];
            int j = Last-1;
            while((j>=LB) && (Arr[j]>Min))
            {
                Arr[j+1] = Arr[j];
                j--;
            }
            Arr[j+1] = Min;
            Last++;
        }
        System.out.println("Array has been Sorted Successfuly.....");
    }
    
    // Insertion Sort in Asceding Order
 
    void insertionSortDescend()
    {
        int Last =LB+1;
        for (int i=LB; i<(N+LB-1); i++)
        {
            int Min = Arr[Last];
            int j = Last-1;
            while((j>=LB) && (Arr[j]<Min))
            {
                Arr[j+1] = Arr[j];
                j--;
            }
            Arr[j+1] = Min;
            Last++;
        }
        System.out.println("Array has been Sorted Successfuly.....");
    }
    
    // Shell Sort in Asceding Order
    
    void shellSortAscend()
    {
        int Gap = N/2;
        while (Gap!=0)
        {
            int Last =LB+Gap;
            for (int i=LB+Gap; i<(N+LB-1); i++)
            {
                int Min = Arr[Last];
                int j = Last-Gap;
                while((j>=LB) && (Arr[j]>Min))
                {
                    Arr[j+Gap] = Arr[j];
                    j = j-Gap;
                }
                Arr[j+Gap] = Min;
                Last++;
            }
            Gap = Gap/2;
        }    
        System.out.println("Array has been Sorted Successfuly.....");
    }
    
    // Shell Sort in Asceding Order
    void shellSortDescend()
    {
        int Gap = N/2;
        while (Gap!=0)
        {
            int Last =LB+Gap;
            for (int i=LB+Gap; i<(N+LB-1); i++)
            {
                int Min = Arr[Last];
                int j = Last-Gap;
                while((j>=LB) && (Arr[j]<Min))
                {
                    Arr[j+Gap] = Arr[j];
                    j = j-Gap;
                }
                Arr[j+Gap] = Min;
                Last++;
            }
            Gap = Gap/2;
        }    
        System.out.println("Array has been Sorted Successfuly.....");
    }
    
    // Merge Sort Ascending
    void mergeSortAscend()
    {
        int Low = LB;
        int High = N+LB-1;
        mergeSortSub(Low, High);
        System.out.println("Array has been Sorted Successfuly.....");
        return;
    }
    //
    void mergeSortSub(int Low, int High)
    {
        if(Low<High)
        {
            int Mid = ((Low+High)/2);
            mergeSortSub(Low, (Mid));
            mergeSortSub((Mid+1), High);
            merge(Low, Mid, High);
        }
        return;
    }
    //
    void merge(int Low, int Mid, int High)
    {
        int NL = (Mid-Low+1);
        int NR = High-Mid;
        int Left[] = new int[NL];
        int Right[] = new int[NR];
        int k =LB;
        for(int i=Low ; i<=Mid ; i++)
        {
            Left[k] = Arr[i];
            k++;
        }
        k =LB;
        for(int i=(Mid+1) ; i<=High ; i++)
        {
            Right[k] = Arr[i];
            k++;
        }
        int SL,SR,SArr;
        SL=SR=LB;
        SArr = Low;
        while((SL<=(NL+LB-1)) && (SR<=(NR+LB-1)))
        {
            if(Left[SL]<Right[SR])
            {
                Arr[SArr] = Left[SL];
                SL++;
            }
            else
            {
                Arr[SArr] = Right[SR];
                SR++;
            }
            SArr++;
        }
        
        if(SL>(NL+LB-1))
        {
            while(SR<=(NR+LB-1))
            {
                Arr[SArr] = Right[SR];
                SR++;
                SArr++;
            }
        }
        else
        {
            while(SL<=(NL+LB-1))
            {
                Arr[SArr] = Left[SL];
                SL++;
                SArr++;
            }
        }
        return;
    }
    
    // Merge Sort Descending
    void mergeSortDescend()
    {
        int Low = LB;
        int High = N+LB-1;
        mergeSortSubDes(Low, High);
        System.out.println("Array has been Sorted Successfuly.....");
        return;
    }
    //
    void mergeSortSubDes(int Low, int High)
    {
        if(Low<High)
        {
            int Mid = ((Low+High)/2);
            mergeSortSubDes(Low, (Mid));
            mergeSortSubDes((Mid+1), High);
            mergeDes(Low, Mid, High);
        }
        return;
    }
    //
    void mergeDes(int Low, int Mid, int High)
    {
        int NL = (Mid-Low+1);
        int NR = High-Mid;
        int Left[] = new int[NL];
        int Right[] = new int[NR];
        int k =LB;
        for(int i=Low ; i<=Mid ; i++)
        {
            Left[k] = Arr[i];
            k++;
        }
        k =LB;
        for(int i=(Mid+1) ; i<=High ; i++)
        {
            Right[k] = Arr[i];
            k++;
        }
        int SL,SR,SArr;
        SL=SR=LB;
        SArr = Low;
        while((SL<=(NL+LB-1)) && (SR<=(NR+LB-1)))
        {
            if(Left[SL]>Right[SR])
            {
                Arr[SArr] = Left[SL];
                SL++;
            }
            else
            {
                Arr[SArr] = Right[SR];
                SR++;
            }
            SArr++;
        }
        
        if(SL>(NL+LB-1))
        {
            while(SR<=(NR+LB-1))
            {
                Arr[SArr] = Right[SR];
                SR++;
                SArr++;
            }
        }
        else
        {
            while(SL<=(NL+LB-1))
            {
                Arr[SArr] = Left[SL];
                SL++;
                SArr++;
            }
        }
        return;
    }
    
    //Quick Sort Asceding    
    void quickSortAscend()
    {
        int Low = LB;
        int High = N+LB-1;
        quickSortSub(Low, High);
        System.out.println("Array has been Sorted Successfuly.....");
        return;
    }
    //
    void quickSortSub(int Low, int High)
    {
       if(Low<High)
        {
            int Index = partition(Low, High);
            quickSortSub(Low, (Index-1));
            quickSortSub((Index+1), High);
        } 
       return; 
    }
    //
    int partition(int Low, int High)
    {
        int Pivot =Arr[Low];
        int i = Low+1;
        int j = N+LB-1;
        while(i<j)
        {
            while((i<=High) && Arr[i]<=Pivot)
            {
                i++;
            }
            while(Arr[j]>Pivot)
            {
                j--;
            }
            if(i<j)
            {
                int temp = Arr[i];
                Arr[i]=Arr[j];
                Arr[j]=temp;
            }
            else
            {
                int temp = Arr[Low];
                Arr[Low] = Arr[j];
                Arr[j] = temp;
            }
        }
        return j;
    }
    
    //Quick Sort Descending
        void quickSortDescend()
    {
        int Low = LB;
        int High = N+LB-1;
        quickSortSubDes(Low, High);
        System.out.println("Array has been Sorted Successfuly.....");
        return;
    }
    //
    void quickSortSubDes(int Low, int High)
    {
       if(Low<High)
        {
            int Index = partitionDes(Low, High);
            quickSortSubDes(Low, (Index-1));
            quickSortSubDes((Index+1), High);
        } 
       return; 
    }
    //
    int partitionDes(int Low, int High)
    {
        int Pivot =Arr[Low];
        int i = Low+1;
        int j = N+LB-1;
        while(i<j)
        {
            while((i>=Low) && Arr[i]>=Pivot)
            {
                i++;
            }
            while(Arr[j]<Pivot)
            {
                j--;
            }
            if(i<j)
            {
                int temp = Arr[i];
                Arr[i]=Arr[j];
                Arr[j]=temp;
            }
            else
            {
                int temp = Arr[Low];
                Arr[Low] = Arr[j];
                Arr[j] = temp;
            }
        }
        return j;
    }
    
    // Merging
    void merging()
    {
        
        System.out.println("Enter The Size of First Array :");
        NA = sc.nextInt();
        A = new int[NA];
        System.out.println("Now Enter the Values of First Array \nValues Must be in Asceding Order :");
        for(int i=LB; i<NA ; i++)
        {
            A[i] = sc.nextInt();
        }
        System.out.println("Enter The Size of Second Array :");
        NB = sc.nextInt();
        B = new int[NB]; 
        System.out.println("Now Insert the Values in Second Array \nValues Must be in Asceding Order :");
        for(int i=LB; i<NB ; i++)
        {
            B[i] = sc.nextInt();
        }
        int NC = NA+NB;
        int C[] = new int[NC];
        int SA,SB,SC;
        SA=SB=SC=LB;
        
        while((SA<=(NA+LB-1)) && (SB<=(NB+LB-1)))
        {
            if(A[SA]<B[SB])
            {
                C[SC] = A[SA];
                SA++;
            }
            else
            {
                C[SC] = B[SB];
                SB++;
            }
            SC++;
        }
        
        if(SA>(NA+LB-1))
        {
            while(SB<=(NB+LB-1))
            {
                C[SC] = B[SB];
                SB++;
                SC++;
            }
        }
        else
        {
            while(SA<=(NA+LB-1))
            {
                C[SC] = A[SA];
                SA++;
                SC++;
            }
        }
        //
        System.out.println("Your First Array is :");
        System.out.print("[");
        for ( int i=LB ; i<=NA+LB-1 ; i++ )
        {
            System.out.print(A[i] + "\t");
        }
        System.out.print("]");
        //
        System.out.println("\nYour Second Array is :");
        System.out.print("[");
        for ( int i=LB ; i<=NB+LB-1 ; i++ )
        {
            System.out.print(B[i] + "\t");
        }
        System.out.print("]");
        //
        System.out.println("\nYour New Array(Merge Array) is :");
        for ( int i=LB ; i<=NC+LB-1 ; i++ )
        {
            System.out.print(C[i] + "\t");
        }
        System.out.println("");
    }
}
