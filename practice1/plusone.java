import java.util.*;
public class MyClass {
   
    public static void main(String args[]) {
      Scanner scan=new Scanner(System.in);
      int n=scan.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
          arr[i]=scan.nextInt();
      }
      arr[n-1]=arr[n-1]+1;
    for(int i=0;i<n;i++)
    {
       
        System.out.print(arr[i]+" ");
    }
    
     
    }
}