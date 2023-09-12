import java.util.*;
class Factorial {
    public static void main(String[] args) {
    int rev,ans=0;
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    Factorial h=new Factorial();
    int res=h.fact(n);
    System.out.println(res);
    }
int fact(int n)
{
    if(n==1)
    return 1;
    else
    {
        return n*fact(n-1);
    }
}
}