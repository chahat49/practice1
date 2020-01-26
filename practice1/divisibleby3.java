import java.util.*;
public class MyClass {
    static boolean div(int n)
    {
        if(n!=0)
        {
        while (n % 3 == 0) {
            n =n/ 3;
        }
   
    return true;
        }
    return false;
      }
     
 
    public static void main(String args[]) 
    {
      Scanner scan=new Scanner(System.in);
      int n=scan.nextInt();
      System.out.println(div(n)); 
    }
}