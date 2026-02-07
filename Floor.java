public class Floor {
    public static void main(String[] args)
    {
        int[] arr={4,7,8,9,9,9,12,12,16,18};
        int x=10;
        int n=arr.length;
        int l=0;
        int high=n;
        int idx=-1;
        while(l<=high)
        {
            int mid=(l+high)/2;
            if(arr[mid]<=x)
            {
                l=mid+1;
                idx=mid;
            }
            else
            {
                high=mid-1;
            }
        }
    System.out.println(idx);
    }
}
