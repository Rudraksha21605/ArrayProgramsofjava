import java.util.*;
public class TwoSum {
    public static void twosum(int[] arr, int target)
    {
        boolean found=false;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    System.out.println("["+i+","+j+"]");
                    found=true;
                    break;
                }
            }
        }
    if(!found)
    {
        System.out.println("Not Found");
    }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n=sc.nextInt();
        System.out.println("Enter target");
        int target=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements into Array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        TwoSum obj=new TwoSum();
        obj.twosum(arr,target);
    }
}

