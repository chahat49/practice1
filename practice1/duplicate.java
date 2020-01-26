import java.util.*;
public class MyClass {
  static boolean dupli(int arr[],int n)
  {
      
      for(int i=0;i<n;i++)
      {
          for(int j=0;j<n;j++)
          {
          if(arr[i]==arr[j])
          return true;
          }
      }
      return false;
  }

    public static void main(String args[]) 
    {
      Scanner scan=new Scanner(System.in);
      int n=scan.nextInt();
      int arr[]=new int[n];
      
      for(int i=0;i<n;i++)
      {
          arr[i]=scan.nextInt();
                
      }
      System.out.println(dupli(arr,n));
     
    
     
    }
}