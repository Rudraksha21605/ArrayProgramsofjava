public class Selectionsort {
    public static void selection(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            int min=Integer.MAX_VALUE;
            int minidx=-1;
            for(int j=i;j<n;j++)
            {
                if(arr[j]<min)
                {
                    min=arr[j];
                    minidx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minidx];
            arr[minidx]=temp;
        }
    for(int ele:arr)
    {
        System.out.print(ele+" ");
    }
    }
    public static void main(String[] args)
    {
        int[] arr={1,5,2,6,3,7,8};
        int n=arr.length;
        selection(arr);
    }
}
