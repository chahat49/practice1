import java.util.*;
public class MyClass 
{
    static int rdupli(int []arr)
    {
        int i=0;
        for(int j=1;j<arr.length;j++)
        {
            if(arr[j]==arr[i])
            continue;
            arr[++i]=arr[j];
        }
        return i+1;
    }
    public static void main(String args[]) {
      Scanner scan=new Scanner(System.in);
      int n=scan.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
          arr[i]=scan.nextInt();
      }
     
      System.out.println(rdupli(arr));
    }
}