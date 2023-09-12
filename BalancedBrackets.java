import java.util.*;
class BalancedBrackets
{
  public static boolean checkpair(char val1,char val2)
   {
     return ((val1=='(' && val2==')') || (val1=='[' && val2==']') || (val1=='{' && val2=='}'));
   }
  public static boolean checkBalanced(String expr)
  {
     Stack<Integer> st = new Stack<>();
     for(int i=0;i<expr.length();i++)
     {
        if(expr.charAt(i)=='(' || expr.charAt(i)=='[' || expr.charAt(i)=='{')
          {st.push(expr.charAt(i));}
        else
         {
           if(st.isEmpty())       //()()]
	   return false;
           else if(checkpair(st.peek(),expr.charAt(i)))
             {
                st.pop();
	        continue;
             }
	return false;
         }
      }
     return true;
  }
  public static void main(String args[])
   {
     Scanner s=new Scanner(System.in);
     String expr="({})";
     String result;
     System.out.println(result = checkBalanced(expr)? "Balanced":"Not Balanced");
   }
}