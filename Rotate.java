import java.util.*;
public class Rotate {
    public static void rotate(int[] arr, int d)
    {
        int n=arr.length;
        d=d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
    }
    public static void reverse(int[] arr,int i,int j)
    {
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        System.out.println("Enter number by which it shoould shift");
        int d=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Rotate obj=new Rotate();
        obj.rotate(arr,d);
    }
}
