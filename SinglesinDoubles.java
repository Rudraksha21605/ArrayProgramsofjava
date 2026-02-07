import java.util.*;
public class SinglesinDoubles {
    public static int single(int[] arr)
    {
        int n=arr.length;
        if(n==1)
        {
            return arr[0];
        }
        if(arr[0]!=arr[1])
        {
            return (arr[0]);
        }
        if(arr[n-1]!=arr[n-2])
        {
            return (arr[n-1]);
        }
        int l=0;
        int high=n;
        while(l<=high)
        {
            int mid=(l+high)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1])
            {
                return arr[mid];
            }
            int f=mid,s=mid;
            if(arr[mid]==arr[mid-1])
            {
                f=mid-1;
            }
            else
            {
                s=mid+1;
            }
            int leftcount=f-l;
            int rightcount=high-s;
            if(leftcount%2==0)
            {
                l=s+1;
            }
            else
            {
                high=f-1;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] arr={1,1,2,2,3,3,4,5,5,6,6,7,7,};
        System.out.println(single(arr));
    }
}
