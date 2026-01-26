public class Middlereverse {
    public static void main(String[] args)
    {
        int[] arr={8,7,5,6,9,11,13,15,18,23};
        int i=3;
        int j=8;
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
    }
}
