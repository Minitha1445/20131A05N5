import java.util.*;
class Power {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int x=s.nextInt();
      int n=s.nextInt();
      int p=Power(x,n);
      System.out.println(p);
    }
    static int Power(int x,int n)
    {
        if(n!=0)
        {
            return x*Power(x,n-1);
        }
        else{
        return 1;
        }          
    }
}