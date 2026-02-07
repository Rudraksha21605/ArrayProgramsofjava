public class Searching {
    public static void main(String[] args)
    {
        int[] arr={100,91,87,76,66,52,43,35,29,13,5};
        int n=arr.length;
        int l=0;
        int high=n;
        int target=43;
        while(l<=high)
        {
            int mid=(l+high)/2;
            if(arr[mid]>target)
            {
                l=mid+1;
            }
            else if(arr[mid]<target)
            {
                high=mid-1;
            }
            else
            {
                System.out.println(mid);
                break;
            }
        }
    }
}
