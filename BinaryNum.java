import java.util.*;
class BinaryNum {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    while(a>0)
    {
        int b=a%10;
        if(b!=0 && b!=1)
        {
            System.out.println("not a binary number");
            break;
        }
        a=a/10;
        if(a==0)
        {
            System.out.println("binary number");
        }
    }
  }
}