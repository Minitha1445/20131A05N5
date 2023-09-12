import java.util.*;
class PerfectNum {
    public static void main(String[] args) {
        int sum=0,i;
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    for(i=1;i<n;i++)
    {
        if(n%i==0)
        {
            sum=sum+i;
        }
    }
    if(sum==n)
    {
        System.out.println("Perfect number");
    }
    else
    {
         System.out.println("Not a Perfect number");

    }
  }
}