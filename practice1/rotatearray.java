import java.util.*;
public class MyClass {
    static int[] rotatearray(int []arr,int n,int k)
    {
        for(int i=0;i<k;i++)
        {
          int temp=arr[n-1];    
          for(int j=n-1;j>0;j--)
             {
                 arr[j]=arr[j-1];
              }
              arr[0]=temp;
        }
        return arr;
    }
    public static void main(String args[]) {
      Scanner scan=new Scanner(System.in);
      int n=scan.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
          arr[i]=scan.nextInt();
      }
      int k=scan.nextInt();
     int p[]=rotatearray(arr,n,k);
     for(int i=0;i<n;i++)
      System.out.println(p[i]);
    }
}