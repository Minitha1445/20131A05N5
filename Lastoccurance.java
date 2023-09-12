import java.util.*;
class Lastoccurance {
    Scanner s=new Scanner(System.in);
	System.out.println("enter array size");
        int n=s.nextInt();
        int arr[]=new int[n];
	System.out.println("enter array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
	System.out.println("enter data element:");
        int d=s.nextInt();
        int lo=arrLO(arr,0,d);
        System.out.println(lo)
    }
    static int arrLO(int[] arr,int idx,int d)
    {
        int last=arrLO(arr,idx+1,d);//1
        if(last==-1)
        {
            if(arr[idx]==d)
            {return idx;}
            else            
            {return -1;}
        }
        else{                
        return last;
    }
   }
}