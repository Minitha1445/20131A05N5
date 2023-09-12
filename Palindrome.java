import java.util.*;
class Palindrome {
    public static void main(String[] args) {
    int rev,ans=0;
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int eww=n;
    while(n>0)
    {
        rev=n%10;
        n=n/10;
        ans=(ans*10)+rev;
    }
    if(eww==ans)
    {
        System.out.println("palindrome");
    }
    else
    {
        System.out.println("not a palindrome");
    }
    }
}