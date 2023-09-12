import java.util.*;
class Firstoccurance {
    public static void main(String[] args) {
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
        int fi=arrFO(arr,0,d);
        System.out.println(fi);
    }
    static int arrFO(int[] arr,int idx,int d)
    {
	if(idx==arr.length)
	  return -1;
        if(arr[idx]==d)
        return idx;
        else
        {
            int first=arrFO(arr,idx+1,d);
            return first;
        }
    }
}