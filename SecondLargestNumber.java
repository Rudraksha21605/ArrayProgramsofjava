import java.util.*;
public class SecondLargestNumber 
{
    public static void Secondlargest(int[] arr)
    {
        int n=arr.length;
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        int max2=arr[0];
        for(int i=0;i<n;i++)
        {
            if (arr[i]>max2 && arr[i]!=max)
                {
                    max2=arr[i];
                }
        }
    System.out.println(max2);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements into array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        SecondLargestNumber obj=new SecondLargestNumber();
        obj.Secondlargest(arr);
    }
}
