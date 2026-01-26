import java.util.*; 
class Reverse
{
    public static void reverse(int[] arr)
    {
        int n=arr.length;
        int i=0;
        int j=n-1;
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
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Reverse obj=new Reverse();
        obj.reverse(arr);
    }
}
    
