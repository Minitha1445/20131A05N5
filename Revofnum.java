import java.util.*;
class Revofnum
{
	public static void main(String[] args) {
	int rem,rev=0;
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	while(n>0)
	{
	    rem=n%10;
	    n=n/10;
	    rev=rev*10+rem;
	}
	System.out.println("rev num is"+rev);
	}
}
