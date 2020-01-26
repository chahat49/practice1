import java.util.*;
public class MyClass {
    static int[] rotatearray(int []arr,int n)
    {
        int count=0;
        for (int i = 0; i < n; i++)
        {
        if(arr[i]!=0)
        {
                arr[count]=arr[i];
                count++;
        }
        }
        for(int i=count;i<n;i++)
        {
            arr[i]=0;
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
     
     int p[]=rotatearray(arr,n);
     for(int i=0;i<n;i++)
      System.out.println(p[i]);
    }
}