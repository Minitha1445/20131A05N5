import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
        HelloWorld h = new HelloWorld();
        h.fib(n);
    }
void fib(int n){
    int a=0,b=1,temp;
	for(int i=0;i<=n;i++){
	   System.out.print(a+" ");
	   temp=a+b;
	   a=b;
	   b=temp;
    }
    }
}


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(f(n,dp));
    }
    public static int f(int n,int[] dp)
    {
        if(n<=1)
        return n;
        
        if(dp[n]!=-1)
        return dp[n];
        
        return f(n-1,dp)+f(n-2,dp);
    }
}