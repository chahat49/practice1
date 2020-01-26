import java.util.*;
public class MyClass {
   
    public static void main(String args[]) {
      Scanner scan=new Scanner(System.in);
      int n=scan.nextInt();
      int arr[]=new int[n];
      int freq[]=new int[1000];
      for(int i=0;i<n;i++)
      {
          arr[scan.nextInt()-1]+=1;
          
      }
      int k=0;
      for(int i=0;i<n;i++)
      {
          if(arr[i]==1)
          {
          k=i+1;
          }
      }
      System.out.print(k);
    }
}