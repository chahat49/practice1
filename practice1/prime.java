import java.util.*;
public class MyClass {
    static boolean prime(int n)
    {
         for(int i=2;i<=n/2;i++)
      {
          if(n%i==0){
              return false;
          }
    
      }
      return true;
    }
 
    public static void main(String args[]) 
    {
      Scanner scan=new Scanner(System.in);
      int n=scan.nextInt();
      int count=0;
     
    for(int i=2;i<n;i++)
    {
        if(prime(i))
        count++;
    }
      System.out.println(count);
     
    
     
    }
}