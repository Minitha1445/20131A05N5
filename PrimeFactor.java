import java.util.*;
class PrimeFactor {
    public static void main(String[] args) {
        int count=0,i;
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    for(i=2;i<n;i++){
    while(n%i==0)
    {
       System.out.println(i+" ");
        n=n/i;
    }
   }
   if(n>=1)
   {
       System.out.println("\nit is a prime factor");
   }
   else
   {
       System.out.println("not a prime factor");
   }
  }
}