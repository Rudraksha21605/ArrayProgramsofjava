public class Enhancedbubblesort {
    public static void print(int[] arr)
    {
        int n=arr.length;
        int swap=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
        if(swap==0){
            break;
        }
    }
    for(int ele:arr)
    {
        System.out.print(ele+" ");
    }
    }

    public static void main(String[] args){
        int [] arr={1,2,3,4,5,6,8,7,9};
        int n=arr.length;
        print(arr);
    }
}
