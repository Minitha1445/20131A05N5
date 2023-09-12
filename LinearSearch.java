import java.util.*;
class LinearSearch {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the size:");
       int n=s.nextInt();
       int arr[]=new int[n];
       System.out.println("Enter the Elements:");
       for(int i=0;i<n;i++)
       {
           arr[i]=s.nextInt();
       }
       System.out.println("Enter the key Element:");
       int key=s.nextInt();
       LinearSearch ls=new LinearSearch();
       ls.linsearch(arr,key, n);
    }
    void linsearch(int[] arr,int key, int n)
    {
        int found=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==key)
            {
               found=1;
            }
        }
        if(found==1)
        {
            System.out.println("Element is found");
        }
        else
        {
            System.out.println("Element is not found");
        }
    }
}