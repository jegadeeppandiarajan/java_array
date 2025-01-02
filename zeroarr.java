import java.util.*;
public class zeroarr {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("RESULT");//ACTUAL CODE
        for(int i=0; i<n; i++)
        {
            if(arr[i]!=0)
                System.out.print(arr[i]+" ");
        }
        for(int i=0; i<n; i++)
        {
            if(arr[i]==0)
            {
                System.out.print( arr[i]+" ");
            }
        }
    }
}
