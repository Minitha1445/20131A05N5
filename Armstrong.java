import java.util.*;
class Armstrong
{
	public static void main(String[] args) {
	int rem,a=0;
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int ques=n;
	while(n>0)
	{
	    rem=n%10;
	    a=a+(rem*rem*rem);
	    n=n/10;
	}
	if(ques==a)
	{
	    System.out.println("it is an armstrong num");
	}
	else
	{
	    System.out.println("not an armstrong");
	}
	}
}
