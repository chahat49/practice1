import java.util.*;
public class MyClass {
    static String index(int []arr,int n,int k)
    {
        int p=0;
        int q=0;
        
        for (int i = 0; i < n; i++)
        {
         for(int j=i+1;j<n;j++)
         {
                if(arr[i]+arr[j]==k)
                {
                p=i;
                q=j;
                }
               
          }
        }
       String g=p+" "+q;
       return g;
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
    
      System.out.println(index(arr,n,k));
    }
}